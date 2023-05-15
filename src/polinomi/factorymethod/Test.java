package polinomi.factorymethod;

import polinomi.Monomio;
import polinomi.Polinomio;

public class Test {

    public static void main(String[] args){

        Polinomio p = new PolinomioArray();
        p.add(new Monomio(2.0, 2));

        Polinomio p2 = new PolinomioArray();
        p2.add(new Monomio(2.0, 2));

        Polinomio somma = p.add(p2);

        System.out.println(somma);

        
    }
}
