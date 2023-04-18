package designPatterns.Prototype.ClonareVariandoValori;

public class Product implements Prototype{

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Prototype clone() {
        return new Product(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
