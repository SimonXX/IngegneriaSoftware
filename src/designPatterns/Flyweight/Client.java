package designPatterns.Flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("A");
        flyweight1.operation(new Context("1"));

        Flyweight flyweight2 = flyweightFactory.getFlyweight("B");
        flyweight2.operation(new Context("2"));

        Flyweight flyweight3 = flyweightFactory.getFlyweight("A");
        flyweight3.operation(new Context("3"));

        // The intrinsic state of flyweight1 and flyweight3 is the same,
        // so only one ConcreteFlyweight instance is created for both
    }
}
