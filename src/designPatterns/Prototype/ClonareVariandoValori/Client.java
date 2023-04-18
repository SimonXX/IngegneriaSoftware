package designPatterns.Prototype.ClonareVariandoValori;

public class Client {

    public static void main(String[] args) {
        ProductPrototype prototype = new ProductPrototype();
        prototype.addPrototype(new Product("Product A"));
        prototype.addPrototype(new Product("Product B"));

        Product product1 = (Product) prototype.createProduct("Product C");
        Product product2 = (Product) prototype.createProduct("Product D");

        System.out.println(product1.getName()); // Output: Product C
        System.out.println(product2.getName()); // Output: Product D
    }
}
