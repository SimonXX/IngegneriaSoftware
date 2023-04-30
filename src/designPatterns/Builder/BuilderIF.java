package designPatterns.Builder;

public interface BuilderIF {
    public void buildPartA();
    public void buildPartB();

    ProductIF getProduct();
}
