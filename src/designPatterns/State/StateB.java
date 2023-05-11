package designPatterns.State;

public class StateB implements State {
    @Override
    public void handleReqA() {
        System.out.println("Stato B: Gestione della richiesta A");
    }

    @Override
    public void handleReqB() {
        System.out.println("Stato B: Gestione della richiesta B");
    }
}