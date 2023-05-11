package designPatterns.Prototype.Struttura;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Prototype prototype1 = new ConcretePrototype1();
        Prototype prototype2 = new ConcretePrototype2();
        client.setPrototype(prototype1);
        client.operation();
        client.setPrototype(prototype2);
        client.operation();
    }
}