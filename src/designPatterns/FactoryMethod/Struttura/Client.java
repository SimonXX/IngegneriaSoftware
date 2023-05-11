package designPatterns.FactoryMethod.Struttura;

public class Client {
    public static void main(String[] args) {
        // Creiamo un oggetto ConcreteCreator
        Creator creator = new ConcreteCreator();

        // Chiamiamo il metodo operation()
        creator.operation();
    }
}
