package designPatterns.Visitor;

public class Main {
    public static void main(String[] args) {

        // Creazione degli Elementi visitabili
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        // Creazione dei Visitor
        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();

        // Visita degli Elementi con i Visitor
        elementA.accept(visitor1); // ConcreteVisitor1 visited ElementA
        elementB.accept(visitor1); // ConcreteVisitor1 visited ElementB


        //OGNI ELEMENTO CONCRETO DICHIARA DI ESSERE VISITATO DAL VISITOR CHE ESEGUIRÁ LE OPPORTUNE OPERAZIONI SU QUELL'ELEMENTO
        elementA.accept(visitor2); // ConcreteVisitor2 visited ElementA
        elementB.accept(visitor2); // ConcreteVisitor2 visited ElementB
    }
}
