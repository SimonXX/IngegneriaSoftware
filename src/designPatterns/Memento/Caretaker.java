package designPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final Originator originator;
    private final List<Memento> history = new ArrayList<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void doSomething() {
        // Salviamo lo stato corrente dell'originator e lo aggiungiamo alla lista della history
        Memento m = originator.save();
        history.add(m);
    }

    public void undo() {
        if (history.isEmpty()) {
            return;
        }

        // Rimuoviamo l'ultimo elemento della history e ripristiniamo lo stato dell'originator a quello corrispondente
        Memento m = history.remove(history.size() - 1);
        originator.restore(m);
    }
}
