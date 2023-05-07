package designPatterns.Flyweight.Structure;

public class Context {
    private String uniqueState;
    private Flyweight flyweight;

    public Context(String repeatingState, String uniqueState) {
        this.uniqueState = uniqueState;
        FlyweightFactory factory = new FlyweightFactory();
        flyweight = factory.getFlyweight(repeatingState);
    }

    public void operation() {
        flyweight.operation(uniqueState);
    }
}
