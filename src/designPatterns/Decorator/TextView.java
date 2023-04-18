package designPatterns.Decorator;

public class TextView implements VisualComponent{
    @Override
    public void operation() {
        System.out.println("Text View");
    }
}
