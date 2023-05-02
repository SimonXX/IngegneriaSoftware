package designPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> savedStates = new ArrayList<Memento>();

    // Metodo per memorizzare un Memento
    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    // Metodo per recuperare l'ultimo Memento salvato
    public Memento getMemento() {
        if (savedStates.size() > 0) {
            Memento m = savedStates.get(savedStates.size()-1);
            savedStates.remove(savedStates.size()-1);
            return m;
        }
        else {
            return null;
        }
    }
}
