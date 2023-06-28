package state.forno;

public class Tubo {

	private interface StatoTuboIF {


		//metodi di supporto
		default void entryAction() {//(in questo caso si notifica lo stato attuale al cliente)
			//si usa per definire nelle inner cosa fare quando si entra in un certo stato
		}

		default void exitAction() {//(in questo caso si notifica lo stato attuale al cliente)
			//si usa per definire nelle inner cosa fare quando si esce da un certo stato
		}


		//metodi per rispondere alle sollecitazioni che arrivano dall'esterno
		default void on() {
		}

		default void off() {
		}

	}

	private final class TuboOn implements StatoTuboIF {
		//non è statica poiché deve invocare il metodo transition della outer


		//modella il tubo quando è nello stato On

		//scrivo solo i metodi che mi servono per lo stato di On(escludo quelli di Off)
		@Override
		public void entryAction() {
			System.out.println("Tubo on");
		}

		@Override
		public void off() {
			transition(OFF);
		}//se siamo nello stato on possiamo effettuare off sul tubo
	}

	private final class TuboOff implements StatoTuboIF {
		//non è statica poiché deve invocare il metodo transition della outer

		//modella il tubo quando è nello stato Off

		//scrivo solo i metodi che mi servono per lo sttato di Off(escludo quelli di On)
		@Override
		public void entryAction() {
			System.out.println("Tubo off");
		}

		@Override
		public void on() {
			transition(ON);
		}//se siamo nello stato off possiamo effettuare on sul tubo
	}

	private final StatoTuboIF ON = new TuboOn();
	private final StatoTuboIF OFF = new TuboOff();
	private StatoTuboIF current = OFF;//inizialmente il tubo è spento


	//invocato dalle inner TuboOn e TuboOff
	private void transition(StatoTuboIF next) {//prende in input lo stato corrente
		current.exitAction();//determina l'uscita al cliente dallo stato preso in input
		current = next;//passiamo allo stato successivo (l'input è On, si passa ad Off e viceversa)
		current.entryAction();//esegue la entry Action relativa allo stato in cui si è entrati
	}


	//il client vede solo questi metodi

	public void switchOn() {
		current.on();
	}

	public void switchOff() {
		current.off();
	}
}
