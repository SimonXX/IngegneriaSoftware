package designPatterns.ChainofResponsibility;

public abstract class HelpHandler {
    protected HelpHandler successor; // Riferimento al successivo oggetto HelpHandler nella catena

    public void setSuccessor(HelpHandler successor) {
        this.successor = successor;
    }

    public abstract void handleHelp();
}