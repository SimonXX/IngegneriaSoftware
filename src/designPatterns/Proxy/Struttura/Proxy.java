package designPatterns.Proxy.Struttura;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        // Prima di inoltrare la richiesta al soggetto reale, possiamo eseguire alcune operazioni di controllo o di pre-elaborazione
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}