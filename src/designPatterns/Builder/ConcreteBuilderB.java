package designPatterns.Builder;

public class ConcreteBuilderB implements BuilderIF{
    private ProductIF product;

    public ConcreteBuilderB(){
        this.product = new Product();
    }
    @Override
    public void buildPartA() {
        product.setPartA("PartA (builderB)");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB (builderB)");
    }

    @Override
    public ProductIF getProduct() {
        return product;
    }
}
