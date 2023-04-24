package designPatterns.Bridge;

public class IconWindow extends Window{
    public void drawContents() {
        // disegna l'icona nella finestra
        windowImpl.deviceBitmap("icon bitmap");
    }

    public void open() {
        // apre l'icona nella finestra
        windowImpl.deviceBitmap("icon bitmap");
    }

    public void close() {
        // chiude l'icona nella finestra
        windowImpl.deviceBitmap("icon bitmap");
    }
}
