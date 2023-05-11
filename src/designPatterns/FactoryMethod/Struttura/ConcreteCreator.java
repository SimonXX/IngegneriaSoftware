package designPatterns.FactoryMethod.Struttura;

public class ConcreteCreator extends Creator {
    @Override
    protected Product createProduct() {
        return new ConcreteProduct();
    }
}
