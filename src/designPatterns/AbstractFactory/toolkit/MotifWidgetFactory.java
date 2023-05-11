package designPatterns.AbstractFactory.toolkit;

public class MotifWidgetFactory implements WidgetFactory {
    public Window createWindow() {
        return new MotifWindow();
    }

    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }
}