package designPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'istanza di ConcreteAggregate
        ConcreteAggregate aggregate = new ConcreteAggregate();

        // Creazione dell'iteratore
        Iterator iterator = aggregate.createIterator();

        // Iterazione della lista di elementi
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
