package designPatterns.Prototype.EsempioBase;

public class ConcretePrototype implements Prototype{

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public Prototype clone() {
        return new ConcretePrototype(name);
    }
}
