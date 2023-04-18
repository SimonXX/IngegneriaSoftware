package designPatterns.Decorator;

import designPatterns.Decorator.Decorator;
import designPatterns.Decorator.VisualComponent;

public class BorderDecorator extends Decorator {
    public BorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void operation(){
        super.operation();
        System.out.println("Operazione di Border Operation");
    }
}
