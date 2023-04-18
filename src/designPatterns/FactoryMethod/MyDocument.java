package designPatterns.FactoryMethod;

public class MyDocument implements Document{

    @Override
    public void open() {
        System.out.println("Text document opened");
    }
}
