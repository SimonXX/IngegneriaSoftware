package designPatterns.Decorator;



public class Decorator implements VisualComponent {

    private VisualComponent component;

    public Decorator(VisualComponent component){
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
