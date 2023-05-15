package designPatterns.ChainofResponsibility.Struttura;

public abstract class Handler {
    protected Handler successor; // Riferimento al successivo oggetto Handler nella catena

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest();
}