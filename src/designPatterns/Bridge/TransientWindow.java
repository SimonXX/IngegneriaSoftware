package designPatterns.Bridge;

public class TransientWindow extends Window {
    public void drawContents() {
        // disegna il contenuto della finestra
        windowImpl.deviceRect(0, 0, 50, 50);
        windowImpl.deviceText("Hello, World!", 10, 10);
    }

    public void open() {
        // apre la finestra temporanea
        windowImpl.deviceRect(0, 0, 50, 50);
    }

    public void close() {
        // chiude la finestra temporanea
        windowImpl.deviceRect(0, 0, 50, 50);
    }
}
