package designPatterns.Bridge;

// Astrazione Window
public abstract class Window {
    protected WindowImpl windowImpl;

    public void setWindowImpl(WindowImpl windowImpl) {
        this.windowImpl = windowImpl;
    }

    public abstract void drawContents();
    public abstract void open();
    public abstract void close();
}
