package designPatterns.Iterator;

// Classe ConcreteAggregate che estende AbstractAggregate e implementa il metodo createIterator()
public class ConcreteAggregate extends AbstractAggregate {
    private String[] items = {"item1", "item2", "item3", "item4", "item5"};

    // Metodo che crea e restituisce un iteratore per la lista di elementi
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    // Metodo che restituisce l'elemento all'indice specificato
    public String getItem(int index) {
        return items[index];
    }

    // Metodo che restituisce la lunghezza della lista di elementi
    public int getCount() {
        return items.length;
    }
}