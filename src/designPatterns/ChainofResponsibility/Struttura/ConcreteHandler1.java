package designPatterns.ChainofResponsibility.Struttura;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest() {
        // Logica per gestire la richiesta specifica di ConcreteHandler1

        // Se ConcreteHandler1 non può gestire la richiesta, la passa al successivo
        if (successor != null) {
            successor.handleRequest();
        }
    }
}