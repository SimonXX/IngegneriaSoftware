package designPatterns.Prototype.EsempioBase;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("prova");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();
        System.out.println("Nome del prototipo: " + prototype.getName());
        System.out.println("Nome del prototipo clonato: " + clonedPrototype.getName());
        System.out.println("Classe del prototipo clonato: " + clonedPrototype.getClass());
    }
}
