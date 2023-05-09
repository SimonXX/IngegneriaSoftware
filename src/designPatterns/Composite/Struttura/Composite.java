package designPatterns.Composite.Struttura;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Eseguo l'operazione del componente composto");

        // Eseguo l'operazione su tutti i figli
        for (Component child : children) {
            child.operation();
        }
    }

    // Implementazione dei metodi per aggiungere, rimuovere e ottenere figli
    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }
}

