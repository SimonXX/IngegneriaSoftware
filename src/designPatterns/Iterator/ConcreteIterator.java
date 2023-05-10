package designPatterns.Iterator;

// Classe ConcreteIterator che implementa l'interfaccia Iterator
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int currentIndex;

    // Costruttore che riceve l'oggetto ConcreteAggregate da iterare
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        currentIndex = 0;
    }

    // Metodo che sposta l'iteratore al prossimo elemento
    public void next() {
        if (currentIndex < aggregate.getCount()) {
            currentIndex++;
        }
    }

    // Metodo che restituisce true se l'iteratore ha raggiunto la fine della lista
    public boolean isDone() {
        return currentIndex >= aggregate.getCount();
    }

    // Metodo che restituisce l'elemento corrente dell'iteratore
    public String currentItem() {
        return aggregate.getItem(currentIndex);
    }
}
