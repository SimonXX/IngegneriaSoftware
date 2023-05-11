package designPatterns.AbstractFactory.toolkit;

public class Main {
    public static void main(String[] args) {
        // creazione della factory GtkWidgetFactory
        WidgetFactory factory = new GtkWidgetFactory();

        // creazione della finestra e della scrollbar utilizzando la factory
        Window window = factory.createWindow();
        ScrollBar scrollBar = factory.createScrollBar();

        // utilizzo della finestra e della scrollbar
        window.setTitle("ciao");
        scrollBar.setOrientation(0);

        // creazione della factory MotifWidgetFactory
        factory = new MotifWidgetFactory();

        // creazione della finestra e della scrollbar utilizzando la factory
        window = factory.createWindow();
        scrollBar = factory.createScrollBar();

        // utilizzo della finestra e della scrollbar
        window.setTitle("ciao");
        scrollBar.setOrientation(0);
    }
}
