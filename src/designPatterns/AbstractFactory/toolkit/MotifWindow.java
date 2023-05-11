package designPatterns.AbstractFactory.toolkit;

public class MotifWindow implements Window {
    public void setTitle(String title) {
        System.out.println("MotifWindow.setTitle(): " + title);
    }

    public void repaint() {
        System.out.println("MotifWindow.repaint()");
    }
}