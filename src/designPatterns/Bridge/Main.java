package designPatterns.Bridge;

public class Main {

    public static void main(String[] args) {
        // Creazione di una finestra IconWindow con implementazione XWindowImpl
        Window iconWindow = new IconWindow();
        iconWindow.setWindowImpl(new XWindowImpl());

        // Disegno dei contenuti della finestra, apertura e chiusura
        iconWindow.drawContents();
        iconWindow.open();
        iconWindow.close();

        System.out.println();

        // Creazione di una finestra TransientWindow con implementazione IBMWindowImpl
        Window transientWindow = new TransientWindow();
        transientWindow.setWindowImpl(new IBMWindowImpl());

        // Disegno dei contenuti della finestra, apertura e chiusura
        transientWindow.drawContents();
        transientWindow.open();
        transientWindow.close();
    }
}
