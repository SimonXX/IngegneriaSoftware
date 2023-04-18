package designPatterns.Singleton;

public class Main {
    public static void main(String[] args) {

        // otteniamo l'istanza singleton
        Singleton mySingleton = Singleton.getInstance();

        // proviamo ad ottenere un'altra istanza
        Singleton myOtherSingleton = Singleton.getInstance();

        // verifichiamo che le due istanze siano la stessa
        if (mySingleton == myOtherSingleton) {
            System.out.println("Le due istanze sono la stessa!");
        } else {
            System.out.println("Errore! Le due istanze sono diverse!");
        }
    }
}
