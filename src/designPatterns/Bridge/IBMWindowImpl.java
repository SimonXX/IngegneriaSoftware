package designPatterns.Bridge;

public class IBMWindowImpl implements WindowImpl {
    public void deviceBitmap(String bitmapName) {
        // implementazione specifica per IBM Presentation Manager
        System.out.println("Drawing bitmap on IBM Presentation Manager: " + bitmapName);
    }

    public void deviceRect(int x, int y, int width, int height) {
        // implementazione specifica per IBM Presentation Manager
        System.out.println("Drawing rectangle on IBM Presentation Manager: " + x + ", " + y + ", " + width + ", " + height);
    }

    public void deviceText(String text, int x, int y) {
        // implementazione specifica per IBM Presentation Manager
        System.out.println("Drawing text on IBM Presentation Manager: " + text + " at " + x + ", " + y);
    }
}