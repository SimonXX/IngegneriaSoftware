package designPatterns.Iterator;

// Classe astratta AbstractAggregate che implementa l'interfaccia Aggregate
public abstract class AbstractAggregate implements Aggregate {
    // Metodo astratto che deve essere implementato dalle classi concrete per restituire l'iteratore
    public abstract Iterator createIterator();
}