package designPatterns.AbstractFactory.toolkit;

public class GtkWidgetFactory implements WidgetFactory {
    public Window createWindow() {
        return new GtkWindow();
    }

    public ScrollBar createScrollBar() {
        return new GtkScrollBar();
    }
}
