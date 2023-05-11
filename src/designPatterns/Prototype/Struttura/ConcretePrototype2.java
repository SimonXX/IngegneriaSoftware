package designPatterns.Prototype.Struttura;

public class ConcretePrototype2 implements Prototype {
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}
