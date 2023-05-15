package designPatterns.ChainofResponsibility;

public class Main {
    public static void main(String[] args) {
        // Creazione degli oggetti handler
        HelpHandler application = new Application();
        HelpHandler dialog = new Dialog();
        HelpHandler button = new Button();

        // Configurazione della catena di responsabilità
        button.setSuccessor(dialog);
        dialog.setSuccessor(application);

        // Esempio di richiesta di aiuto
        button.handleHelp();
    }
}
