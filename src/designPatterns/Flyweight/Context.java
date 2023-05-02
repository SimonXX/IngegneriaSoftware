package designPatterns.Flyweight;

public class Context {
    private String extrinsicState;

    public Context(String extrinsicState) {
        this.extrinsicState = extrinsicState;
    }

    public String getExtrinsicState() {
        return extrinsicState;
    }
}
