package designPatterns.Flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation(Context context) {
        System.out.println("Concrete Flyweight with intrinsic state: " + intrinsicState + " and extrinsic state: " + context.getExtrinsicState());
    }
}