package designPatterns.Bridge.Struttura;

public class Main {
    public static void main(String[] args) {

        Abstraction abs1 = new RefinedAbstraction(new ConcreteImplementorA());
        Abstraction abs2 = new RefinedAbstraction(new ConcreteImplementorB());

        abs1.operation();
        abs2.operation();
    }
}
