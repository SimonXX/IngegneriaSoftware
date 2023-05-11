package designPatterns.AbstractFactory.toolkit;

public class MotifScrollBar implements ScrollBar {
    public void setOrientation(int orientation) {
        System.out.println("MotifScrollBar.setOrientation(): " + orientation);
    }

    public int getValue() {
        System.out.println("MotifScrollBar.getValue()");
        return 0;
    }
}