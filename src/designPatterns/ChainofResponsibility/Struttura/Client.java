package designPatterns.ChainofResponsibility.Struttura;

public class Client {
    public static void main(String[] args) {
        // Creazione degli oggetti handler
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();

        // Configurazione della catena di responsabilità
        concreteHandler1.setSuccessor(concreteHandler2);

        // Esempio di richiesta
        concreteHandler1.handleRequest();
    }
}
