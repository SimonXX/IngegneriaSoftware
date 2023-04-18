package ListaProxy.lista;

import ListaProxy.lista.copyonwrite.ListaCopyOnWrite;
import ListaProxy.lista.impl.ListaSuArray;
import ListaProxy.lista.sicurezza.ListaSicura;

public class Liste {

	public static <E> Lista<E> creaLista(int dim, boolean proxy) {
		Lista<E> miaLista = new ListaSuArray<E>(dim);
		if (!proxy)
			return miaLista;
		else
			return new ListaCopyOnWrite<E>(miaLista);
	}

	public static <E> Lista<E> creaListaSicura(int dim, int nread, int nwrite, boolean proxy) {
		Lista<E> miaLista = new ListaSuArray<E>(dim);

		if (proxy)//si può anche crearla CopyOnWrite oltre che sicura
			miaLista = new ListaCopyOnWrite<E>(miaLista);

		return new ListaSicura<E>(miaLista, nread, nwrite);
	}

}
