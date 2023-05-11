package designPatterns.State;

public class Context {
    private State currentState;

    public Context() {
        // Impostiamo lo stato iniziale
        currentState = new StateA();
    }

    public void requestA() {
        // Richiamiamo il metodo dell'oggetto corrente
        currentState.handleReqA();
    }

    public void requestB() {
        // Richiamiamo il metodo dell'oggetto corrente
        currentState.handleReqB();
    }

    public void setCurrentState(State state) {
        // Impostiamo lo stato corrente
        this.currentState = state;
    }
}