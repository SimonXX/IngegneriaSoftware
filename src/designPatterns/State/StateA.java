package designPatterns.State;

public class StateA implements State {
    @Override
    public void handleReqA() {
        System.out.println("Stato A: Gestione della richiesta A");
    }

    @Override
    public void handleReqB() {
        System.out.println("Stato A: Gestione della richiesta B");
    }
}