package designPatterns.Flyweight.Structure;

public class FlyweightFactory {
    private Flyweight[] cache = new Flyweight[3];

    public Flyweight getFlyweight(String repeatingState) {
        Flyweight flyweight = cache[getIndex(repeatingState)];

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(repeatingState);
            cache[getIndex(repeatingState)] = flyweight;
        }

        return flyweight;
    }

    private int getIndex(String repeatingState) {
        switch (repeatingState) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            default:
                throw new IllegalArgumentException("Unknown repeating state: " + repeatingState);
        }
    }
}
