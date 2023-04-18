package designPatterns.Prototype.ClonareVariandoStruttura;

public class Resistor extends Part{
    private double resistance;

    public Resistor(String name, double price, double resistance) {
        super(name, price);
        this.resistance = resistance;
    }

    public double getResistance() {
        return resistance;
    }

    public Part clone() throws CloneNotSupportedException {
        return (Resistor) super.clone();
    }
}
