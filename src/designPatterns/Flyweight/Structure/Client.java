package designPatterns.Flyweight.Structure;

public class Client {
    public static void main(String[] args) {
        Context contextA = new Context("A", "state 1");
        contextA.operation();

        Context contextB = new Context("B", "state 2");
        contextB.operation();

        Context contextC = new Context("C", "state 3");
        contextC.operation();

        Context contextA2 = new Context("A", "state 4");
        contextA2.operation();

        Context contextB2 = new Context("B", "state 5");
        contextB2.operation();
    }
}
