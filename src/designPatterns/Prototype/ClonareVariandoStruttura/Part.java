package designPatterns.Prototype.ClonareVariandoStruttura;

public class Part implements Cloneable{

    private String name;
    private double price;

    public Part(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Part clone() throws CloneNotSupportedException {
        return (Part) super.clone();
    }
}
