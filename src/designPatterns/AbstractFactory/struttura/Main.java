package designPatterns.AbstractFactory.struttura;

public class Main {

    //(GUARDARE SCHEMA UML)
    //IN QUESTA IMPLEMENTAZIONE
    //ConcreteFactory1 si occupa di ProductB1 e ProductA1
    //CocnreteFactory2 si occupa di Product A2 e ProductB2
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA1.operationA();
        productB1.operationB();

        productA2.operationA();
        productB2.operationB();


    }
}