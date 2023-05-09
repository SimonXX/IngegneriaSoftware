package designPatterns.Composite.Struttura;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Eseguo l'operazione del componente foglia");
    }

    // Implementazione dei metodi per aggiungere, rimuovere e ottenere figli (in questo caso, non ha figli)
    @Override
    public void add(Component c) {
        // Non si può aggiungere un figlio ad un componente foglia
        System.out.println("Impossibile aggiungere un figlio ad un componente foglia");
    }

    @Override
    public void remove(Component c) {
        // Non si può rimuovere un figlio da un componente foglia
        System.out.println("Impossibile rimuovere un figlio da un componente foglia");
    }

    @Override
    public Component getChild(int i) {
        // Non si possono ottenere figli da un componente foglia
        System.out.println("Impossibile ottenere un figlio da un componente foglia");
        return null;
    }
}
