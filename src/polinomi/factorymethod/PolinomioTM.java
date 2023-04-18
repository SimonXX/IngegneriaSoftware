package polinomi.factorymethod;
import polinomi.Monomio;

import polinomi.Polinomio;

import java.util.Map;
import java.util.TreeMap;


/**
 * Fornisce un'implementazione dell'interfaccia {@link Polinomio} basata su una
 * mappa di tipo {@link java.util.TreeMap}.
 * 
 * @author Angelo Furfaro
 * 
 */
public class PolinomioTM extends PolinomioMap {

	@Override
	protected PolinomioTM create() {

		return new PolinomioTM();
	}

	@Override
	protected Map<Integer, Monomio> createMap() {

		return new TreeMap<>();
	}

}
