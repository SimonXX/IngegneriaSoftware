package designPatterns.Builder;

public class Main {
    public static void main(String[] args) {

        BuilderIF builder = new ConcreteBuilderA();//scegliamo lo specifico builder
        Director director = new Director();

        director.build(builder);//l'oggetto viene creato in base allo specifico builder

        //non dobbiamo conoscere la classe concreta del prodotto ma dichiariamo solo 'interfaccia
        ProductIF product = builder.getProduct();
        product.printParts();

        //vogliamo adesso creare in maniera diversa il prodotto

        //il direttore rimane lo stesso
        //cambia solo il builder concreto che usiamo al fine di creare l'oggetto product

        BuilderIF builder2 = new ConcreteBuilderB();
        director.build(builder2);
        ProductIF product2 = builder2.getProduct();
        product2.printParts();
    }
}
