package designPatterns.AbstractFactory.toolkit;

public interface WidgetFactory {
    Window createWindow();
    ScrollBar createScrollBar();
}