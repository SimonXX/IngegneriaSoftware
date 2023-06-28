package state.forno;

public class Luce implements LuceIF {//simile alla classe Tubo
	//differenza -> metodo on e off adesso hanno dei parametri -> vogliamo disaccoppiare, a differenza di ciò che accade nella classe Tubo
	//le classi inner dalle outer


	// Luce con automa alla Mealy ed enumeration
	private interface StatoLuceIF {
		default void on(Luce l) {//passando l capiamo quale sia l'unica classe statica LuceOn alla quale l'outer class fa riferimento
		}

		default void off(Luce l) {//passando l capiamo quale sia l'unica classe statica LuceOff alla quale l'outer class fa riferimento
		}
	}


	//le enumeration è come se fossero classi
	private enum StatoLuce implements StatoLuceIF {

		//evitiamo di portarci dietro 2 classi private come LuceOn e LuceOff, come fanno in Tubo
		//fare la stessa cosa nella classe Forno sarà utilissivo per evitare di definire una classe privata per ogni stato
		ON {//vale come una inner class

			@Override
			public void off(Luce l) {
				System.out.println("Luce off");
				l.transition(OFF);
			}
		},
		OFF {//vale come una inner class
			@Override
			public void on(Luce l) {
				System.out.println("Luce on");
				l.transition(ON);

			}

		}
	}


	//simile al metodo della classe Tubo
	private void transition(StatoLuceIF next) {
		current = next;
	}


	//lo stato corrente della luce inizialmente è Off
	private StatoLuceIF current = StatoLuce.OFF;

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.state.forno.LuceIF#switchOn()
	 */


	//metodi pubblici che il client può utilizzare
	@Override
	public void switchOn() {
		current.on(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.state.forno.LuceIF#switchOff()
	 */
	@Override
	public void switchOff() {//lo stato della luce viene messo ad off
		current.off(this);
	}
}
