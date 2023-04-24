package designPatterns.Bridge;

public class XWindowImpl implements WindowImpl {

    public void deviceBitmap(String bitmapName) {
        // implementazione specifica per X Window
        System.out.println("Drawing bitmap on X Window: " + bitmapName);
    }

    public void deviceRect(int x, int y, int width, int height) {
        // implementazione specifica per X Window
        System.out.println("Drawing rectangle on X Window: " + x + ", " + y + ", " + width + ", " + height);
    }

    public void deviceText(String text, int x, int y) {
        // implementazione specifica per X Window
        System.out.println("Drawing text on X Window: " + text + " at " + x + ", " + y);
    }
}

