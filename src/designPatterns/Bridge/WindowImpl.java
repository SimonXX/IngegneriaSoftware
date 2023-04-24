package designPatterns.Bridge;

public interface WindowImpl {
    public void deviceBitmap(String bitmapName);
    public void deviceRect(int x, int y, int width, int height);
    public void deviceText(String text, int x, int y);
}
