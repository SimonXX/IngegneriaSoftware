package designPatterns.Memento;

public class Originator {
    private String state;

    public void setState(String newState) {
        System.out.println("Originator: Imposto lo stato a " + newState);
        state = newState;
    }

    // Metodo per creare un Memento contenente l'istantanea del proprio stato
    public Memento saveToMemento() {
        System.out.println("Originator: Salvataggio dello stato in un Memento.");
        return new Memento(state);
    }

    // Metodo per ripristinare il proprio stato interno a partire da un Memento
    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: Stato ripristinato da Memento: " + state);
    }
    public String getState() {
        return state;
    }
}
