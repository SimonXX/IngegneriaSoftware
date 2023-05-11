package designPatterns.FactoryMethod.Struttura;

public class ConcreteProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("ConcreteProduct: eseguo l'azione del prodotto.");
    }
}