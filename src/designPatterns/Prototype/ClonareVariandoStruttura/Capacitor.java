package designPatterns.Prototype.ClonareVariandoStruttura;

public class Capacitor extends Part{

    private double capacitance;

    public Capacitor(String name, double price, double capacitance) {
        super(name, price);
        this.capacitance = capacitance;
    }

    public double getCapacitance() {
        return capacitance;
    }

    public Part clone() throws CloneNotSupportedException {
        return (Capacitor) super.clone();
    }
}
