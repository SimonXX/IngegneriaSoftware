package designPatterns.Composite.Struttura;

public class Client {
    public static void main(String[] args) {
        // Creo un componente composto
        Composite composite = new Composite();

        // Aggiungo due componenti foglia
        composite.add(new Leaf());
        composite.add(new Leaf());

        // Creo un secondo componente composto
        Composite composite2 = new Composite();

        // Aggiungo il primo componente composto e un'altra componente foglia
        composite2.add(composite);
        composite2.add(new Leaf());

        // Eseguo l'operazione sull'intero albero
        composite2.operation();
    }
}
