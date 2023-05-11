package designPatterns.Proxy.Struttura;

public class Client {
    public static void main(String[] args) {
        // Creiamo un oggetto proxy
        Subject subject= new Proxy();

        // Chiamiamo il metodo request() sul proxy
        subject.request();
    }
}
