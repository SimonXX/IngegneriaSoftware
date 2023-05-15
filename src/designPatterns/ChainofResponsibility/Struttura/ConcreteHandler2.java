package designPatterns.ChainofResponsibility.Struttura;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest() {
        // Logica per gestire la richiesta specifica di ConcreteHandler2

        // Se ConcreteHandler2 non può gestire la richiesta, la passa al successivo
        if (successor != null) {
            successor.handleRequest();
        }
    }
}