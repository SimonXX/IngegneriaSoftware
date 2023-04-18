package ListaProxy.lista.copyonwrite;

import ListaProxy.lista. Lista;

public class ListaCopyOnWrite<E> implements Lista<E> {

	private static final class ReferenceCounter<E> {
		private int counter;
		private Lista<E> lista;

		public ReferenceCounter(Lista<E> l) {
			counter = 1;
			lista = l;
		}

		public Lista<E> getLista() {
			return lista;
		}//attraverso questo metodo si invocano le operazioni sulla lista

		public synchronized void decr() {
			counter--;
		}

		public synchronized void incr() {
			counter++;
		}

		public synchronized ReferenceCounter<E> copyIfNecessary() {

			//Se il contatore è a 1 ritorni this (proprio la lista), se non è uguale a 1 creo una nuova lista attraverso lista.copia(),
			// e decremento il contatore, poiché significa che esiste una nuova istanza della lista.

			if (counter == 1) {//abbiamo un solo thread che sta lavorando sulla lista, non serve copiarla
				return this;
				//Se mi accorgo di essere l’unico a possedere il riferimento la copy-on-write sarebbe inutile,
				// quindi se il numero di riferimenti è 1 e lo posseggo solo io, opero/modifico direttamente sulla lista
			}

			//più thread stanno usando in maniera concorrente la lista
			ReferenceCounter<E> cr = new ReferenceCounter<E>(lista.copia());

			//nel momento della modifica o aggiunta di qualcosa nella lista,
			// crea un nuovo ReferenceCounting identico alla lista priva di modifiche e lo assegno all’utente che non sta operando modifiche e decrementerò a 1 il contatore.

			counter--;
			return cr;
			//Non restituirò proprio la lista, ma il rifermento a quella lista ed è proprio per questo che devo decrementare il contatore dei riferimenti
		}
	}
	//La lista copy-on-write tiene conto dei riferimenti, conterrà un unico
	//CountingReference, poiché posso aggiungere più di una lista, ma la lista proxy copy-on-write è unica
	private ReferenceCounter<E> ref;

	public ListaCopyOnWrite(Lista<E> l) {
		if (l instanceof ListaCopyOnWrite)
			throw new IllegalArgumentException("Proxy multipli non ammessi");
		ref = new ReferenceCounter<E>(l);
	}

	private ListaCopyOnWrite() {
	}

	@Override
	public int size() {
		return ref.getLista().size();
	}

	@Override
	public boolean contiene(E dato) {
		return ref.getLista().contiene(dato);
	}

	@Override
	public void aggiungi(int index, E dato) throws IndexOutOfBoundsException {
		ref = ref.copyIfNecessary();
		ref.getLista().aggiungi(index, dato);
	}

	@Override
	public void aggiungi(E dato) {

		//effettueremo la modifica o sulla stessa lista (ritorna this su ref) o su una copia
		ref = ref.copyIfNecessary();
		ref.getLista().aggiungi(dato);
	}

	@Override
	public void rimuovi(int index) throws IndexOutOfBoundsException {
		ref = ref.copyIfNecessary();
		ref.getLista().rimuovi(index);
	}

	@Override
	public boolean rimuovi(E dato) {
		ref = ref.copyIfNecessary();
		return ref.getLista().rimuovi(dato);
	}

	@Override
	public E dammiElemento(int index) throws IndexOutOfBoundsException {
		return ref.getLista().dammiElemento(index);
	}

	@Override
	public Lista<E> copia() {//un thread richiede la copia di una lista già esistente che implementa la copy-on-write

		//viene creata una nuova lista copyOnwrite ma il referenceCounter resta lo stesso

		ListaCopyOnWrite<E> l = new ListaCopyOnWrite<E>();

		l.ref = this.ref;
		ref.incr();//si incrementa il reference counter perchè di fatto la lista che si sta usando è la stessa
		return l;
	}

	@Override
	protected void finalize() throws Throwable {//Il metodo finalize() intercetta la chiamata al garbageCollector, per evitare di distruggere la lista.

		try {
			ref.decr();
		} catch (Throwable t) {
			throw t;
		} finally {
			super.finalize();
		}
	}

	@Override
	public String toString() {
		return ref.getLista().toString();
	}
}
