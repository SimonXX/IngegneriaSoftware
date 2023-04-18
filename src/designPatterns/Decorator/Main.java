package designPatterns.Decorator;

public class Main {
    public static void main(String[] args){

        VisualComponent component = new BorderDecorator(new ScrollDecorator(new TextView()));

        component.operation();


    }
}
