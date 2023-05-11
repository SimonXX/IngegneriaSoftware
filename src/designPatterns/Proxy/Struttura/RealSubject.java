package designPatterns.Proxy.Struttura;

// Classe del soggetto reale
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: gestione della richiesta.");
    }
}