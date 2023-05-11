package designPatterns.FactoryMethod.Struttura;

public abstract class Creator {
    protected abstract Product createProduct();

    public void operation() {
        Product product = createProduct();
        System.out.println("Creator: creo un prodotto.");
        product.doSomething();
    }
}
