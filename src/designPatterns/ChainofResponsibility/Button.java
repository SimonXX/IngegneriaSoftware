package designPatterns.ChainofResponsibility;

public class Button extends Widget {
    @Override
    public void handleHelp() {
        if (canHandleHelp()) {
            // Logica per mostrare l'aiuto del pulsante
            showHelp();
        } else {
            // Passa la richiesta all'oggetto successivo nella catena
            if (successor != null) {
                successor.handleHelp();
            }
        }
    }

    private boolean canHandleHelp() {
        // Logica per determinare se il pulsante può gestire l'aiuto
        return false;
    }

    private void showHelp() {
        // Logica per mostrare l'aiuto del pulsante
    }
}
