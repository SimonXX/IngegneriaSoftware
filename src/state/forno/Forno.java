package state.forno;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Forno implements FornoIF {

	// gestione dei timer
	private final ScheduledExecutorService executor = Executors
			.newSingleThreadScheduledExecutor();//le attività programmate verranno eseguite sequenzialmente in un singolo thread, garantendo che non vengano
			//eseguire in contemporanea

	private ScheduledFuture<?> timerControl;

	private Runnable timeoutTask;

	// definizione interfaccia stato del forno
	private interface StatoFornoIF {// definisce i metodi per le azioni e le transizioni di stato del forno.

		default void entryAction(Forno f) {
		}

		default void exitAction(FornoIF f) {
		}

		default void apri(Forno f) {
		}

		default void chiudi(Forno f) {
		}

		default void start(Forno f) {
		}

		default void timeout(Forno f) {
		}
	}

	//i metodi dell'enumaration sono pubblici ma non visibili dall'esterno in quanto l'enumerazione è privata
	//quindi solo chi ha un'istanza dell'enumerazione può accedervi (non il cliente)

	private static enum StatoForno implements StatoFornoIF {
		//definisco una classe che si adatta a più categorie di classe di stato
		//ma bisogna comunque aggiungere caratteristiche specifiche di comportamento


		// rappresenta i diversi stati possibili del forno, come "Porta Chiusa", "Porta Aperta", "Inizio Cottura"


		//DEFINIAMO SOLO I METODI CHE POSSONO AVVENIRE IN OGNI STATO
		//se si esegue ad esempio il metodo chiudi in porta chiusa, si esegue un metodo vuoto, perché nella classe dell'enum non è definito
		PORTA_CHIUSA {
			@Override
			public void entryAction(Forno f) {
				System.out.println("Porta Chiusa");//si segnala la porta chiusa
				f.luceOff();//si gestisce la luce
			}// action

			@Override
			public void apri(Forno f) {
				f.transition(PORTA_APERTA);
			}

			@Override
			public void start(Forno f) {
				f.transition(INIZIO_COTTURA);
			}
		},
		PORTA_APERTA {
			@Override
			public void entryAction(Forno f) {
				System.out.println("Porta Aperta");
				f.luceOn();
			}// action

			@Override
			public void chiudi(Forno f) {
				f.transition(PORTA_CHIUSA);
			}
		},
		INIZIO_COTTURA {
			@Override
			public void entryAction(Forno f) {
				System.out.println("Inizio Cottura");
				f.luceOff();
				f.tuboOn();
				f.startTimer();
			}// action

			@Override
			public void apri(Forno f) {
				f.transition(COTTURA_INTERROTTA);
			}

			@Override
			public void start(Forno f) {
				f.transition(COTTURA_ESTESA);
			}

			@Override
			public void timeout(Forno f) {
				f.transition(FINE_COTTURA);
			}
		},
		COTTURA_INTERROTTA {
			@Override
			public void entryAction(Forno f) {
				System.out.println("Cottura Interrotta");
				f.tuboOff();
				f.cancelTimer();

			}// action

			@Override
			public void chiudi(Forno f) {
				f.transition(PORTA_CHIUSA);
			}

		},
		COTTURA_ESTESA {
			public void entryAction(Forno f) {
				System.out.println("Cottura Estesa");

				f.startTimer();

			}// action

			@Override
			public void apri(Forno f) {
				f.transition(COTTURA_INTERROTTA);
			}

			@Override
			public void start(Forno f) {
				f.transition(COTTURA_ESTESA);
			}

			@Override
			public void timeout(Forno f) {
				f.transition(FINE_COTTURA);
			}
		},
		FINE_COTTURA {
			@Override
			public void entryAction(Forno f) {
				System.out.println("Fine Cottura - Beep!");
				f.luceOff();
				f.tuboOff();

			}// action

			@Override
			public void apri(Forno f) {
				f.transition(PORTA_APERTA);
			}
		}

	}

	private final LuceIF luce;
	private final Tubo tubo;//per il Tubo non abbiamo definito interfaccia
	private StatoFornoIF currentState;//attraverso questa variabile si arriva allo stato appropiato corrente definito nella enum
	//che invocherà il corretto metodo transition
	private final Lock lock = new ReentrantLock();

	public Forno(LuceIF luce, Tubo tubo) {
		this.luce = luce;
		this.tubo = tubo;

		transition(StatoForno.PORTA_CHIUSA);//inizialmente a priori sappiamo che la porta è chiusa
	}// Forno



	//viene utilizzato al fine di eseguire la transizione tra gli stati del forno
	private final void transition(StatoFornoIF nextState) {//questo stato next, viene passato dalla classe definita nell'enum, es. il metodo chiudi in cottura interrotta
		//passera a transition (PORTA_CHIUSA)

		//si gestiscono le esecuzioni delle azioni di uscita e di ingresso associate al cambio di stato
		if (currentState != null)
			currentState.exitAction(this);//alla prima esecuzione, il currentState sarà null, non si entrerà in questo if
		//alla prima esecuzione il nextState è Porta_chiusa
		currentState = nextState;
		currentState.entryAction(this);
	}// transition


	//vengono definiti i metodi per le azioni specifiche del forno, che sono chiamati dalle implementazioni degli stati al fine di eseguire le azioni specifiche del forno
	void luceOff() {//questo metodo viene richiamato dalla classe forno in base allo stato definito nella private enum
		luce.switchOff();

	}

	void luceOn() {
		luce.switchOn();

	}

	void tuboOn() {
		tubo.switchOn();

	}

	void tuboOff() {
		tubo.switchOff();

	}

	void cancelTimer() {//cancella il timer
		timerControl.cancel(true);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.state.forno.FornoIF#apri()
	 */


	//abbiamo un problema di concorrenza con gli eventi:
	//se sto gestendo l'evento di apertura, esso potrebbe andare in conflitto con i thread che gestiscono chiudi e timeout
	//per tale motivo si usano dei lock: rendiamo atomiche le transizioni di stato
	@Override
	public void apri() {

		lock.lock();
		try {
			currentState.apri(this);//si richiama il metodo appropriato dello stato corrente del forno
		} finally {
			lock.unlock();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.state.forno.FornoIF#chiudi()
	 */
	@Override
	public void chiudi() {

		lock.lock();
		try {
			currentState.chiudi(this);
		} finally {
			lock.unlock();

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.state.forno.FornoIF#start()
	 */
	@Override
	public void start() {
		lock.lock();
		try {
			currentState.start(this);
		} finally {
			lock.unlock();

		}

	}

	//gestisce l'azione di timeout di chiamata quando scade il timer
	private void timeout() {//non visibile all'utente
		lock.lock();
		try {
			currentState.timeout(this);
		} finally {
			lock.unlock();

		}

	}


	//avvia il timer per il forno
	private void startTimer() {

		if (timeoutTask == null) {
			timeoutTask = () -> timeout();

		} else {
			timerControl.cancel(true);

		}

		//java ci consente di definire dei task-> schedula l'esecuzione del task del timeout tra 10 secondi: se non c'è un timer lo inserisce in questo modo
		timerControl = executor.schedule(timeoutTask, 10, TimeUnit.SECONDS);//timerControl contrellerà il timer

	}

}
