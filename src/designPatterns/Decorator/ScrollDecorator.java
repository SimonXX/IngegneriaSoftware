package designPatterns.Decorator;

public class ScrollDecorator extends Decorator{


    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Operazione di ScrollDecorator");
    }
}
