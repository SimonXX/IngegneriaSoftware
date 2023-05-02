package designPatterns.Memento;

public class Memento {
    private String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }

    // Metodo di accesso allo stato salvato
    protected String getState() {
        return state;
    }
}
