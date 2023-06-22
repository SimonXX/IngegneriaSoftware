package Mediator.mediator;

import javax.swing.*;

// Classe concreta del Mediator
class FormMediator implements MediatorIF {
    private JTextField nomeTextField;
    private JTextField cognomeTextField;
    private JButton salvaButton;


    public void setNomeTextField(JTextField nomeTextField) {
        this.nomeTextField = nomeTextField;
    }

    public void setCognomeTextField(JTextField cognomeTextField) {
        this.cognomeTextField = cognomeTextField;
    }

    public void setSalvaButton(JButton salvaButton) {
        this.salvaButton = salvaButton;
    }

    @Override
    public void widgetCambiato(JComponent widget) {
        if (widget == nomeTextField || widget == cognomeTextField) {
            salvaButton.setEnabled(isCampiValidi());
        }
        if(widget==salvaButton){
                String nome = nomeTextField.getText().trim();
                String cognome = cognomeTextField.getText().trim();

                JOptionPane.showMessageDialog(SwingUtilities.getAncestorOfClass(JFrame.class, widget)
, "Salvataggio effettuato: " + nome + " " + cognome);

        }
    }

    private boolean isCampiValidi() {
        String nome = nomeTextField.getText().trim();
        String cognome = cognomeTextField.getText().trim();
        return !nome.isEmpty() && !cognome.isEmpty();
    }
}
