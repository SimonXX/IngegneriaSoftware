package polinomi.prototype;

import polinomi.Monomio;

public class Test {
    public static void main(String[] args) {
        // Creazione del polinomio originale
        PolinomioLL polinomioOriginale = new PolinomioLL();
        polinomioOriginale.add(new Monomio(3, 2));  // Aggiunge il monomio 3x^2
        polinomioOriginale.add(new Monomio(5, 1));  // Aggiunge il monomio 5x
        polinomioOriginale.add(new Monomio(2, 0));  // Aggiunge il monomio 2

        // Clonazione del polinomio
        PolinomioLL polinomioClone = polinomioOriginale.clone();

        // Modifica del polinomio clone
        polinomioClone.add(new Monomio(4, 3));  // Aggiunge il monomio 4x^3

        // Stampa dei polinomi
        System.out.println("Polinomio originale:");
        stampaPolinomio(polinomioOriginale);

        System.out.println("Polinomio clone:");
        stampaPolinomio(polinomioClone);
    }

    private static void stampaPolinomio(PolinomioLL polinomio) {
        for (Monomio monomio : polinomio) {
            System.out.print(monomio.getCoeff() + "x^" + monomio.getGrado() + " + ");
        }
        System.out.println();
    }
}
