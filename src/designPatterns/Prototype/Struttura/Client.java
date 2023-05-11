package designPatterns.Prototype.Struttura;

public class Client {
    private Prototype prototype;

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        Prototype p = prototype.clone();
        // Operazioni con l'oggetto clonato
    }
}