package designPatterns.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'istanza di ConcreteClass1
        ConcreteClass1 concreteClass1 = new ConcreteClass1();

        // Esecuzione del Template Method con ConcreteClass1
        concreteClass1.TemplateMethod();

        // Creazione dell'istanza di ConcreteClass2
        ConcreteClass2 concreteClass2 = new ConcreteClass2();

        // Esecuzione del Template Method con ConcreteClass2
        concreteClass2.TemplateMethod();
    }
}
