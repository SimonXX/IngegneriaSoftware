package designPatterns.AbstractFactory.toolkit;

public class GtkScrollBar implements ScrollBar {
    public void setOrientation(int orientation) {
        System.out.println("GtkScrollBar.setOrientation(): " + orientation);
    }

    public int getValue() {
        System.out.println("GtkScrollBar.getValue()");
        return 0;
    }
}
