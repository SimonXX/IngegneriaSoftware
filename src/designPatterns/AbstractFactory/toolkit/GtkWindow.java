package designPatterns.AbstractFactory.toolkit;

public class GtkWindow implements Window {
    public void setTitle(String title) {
        System.out.println("GtkWindow.setTitle(): " + title);
    }

    public void repaint() {
        System.out.println("GtkWindow.repaint()");
    }
}