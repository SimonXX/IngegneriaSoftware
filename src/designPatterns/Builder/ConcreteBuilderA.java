package designPatterns.Builder;

public class ConcreteBuilderA implements BuilderIF{

    private ProductIF product;

    public ConcreteBuilderA(){
        this.product = new Product();
    }

    public void buildPartA() {
        product.setPartA("PartA");
    }

    public void buildPartB() {
        product.setPartB("PartB");
    }

    public ProductIF getProduct() {
        return product;
    }
}
