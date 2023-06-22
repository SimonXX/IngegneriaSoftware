package Mediator.mediator;


import javax.swing.*;
import java.awt.*;

// Esempio di utilizzo del pattern Mediator con widgets
public class ProvaMediator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField nomeTextField = new JTextField(20);
        JTextField cognomeTextField = new JTextField(20);
        JButton salvaButton = new JButton("Salva");
        salvaButton.setEnabled(false);

        FormMediator mediator = new FormMediator();
        mediator.setNomeTextField(nomeTextField);
        mediator.setCognomeTextField(cognomeTextField);
        mediator.setSalvaButton(salvaButton);


        nomeTextField.addActionListener(e -> mediator.widgetCambiato(nomeTextField));

//        nomeTextField.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mediator.widgetCambiato(nomeTextField);
//            }
//        });
//
        cognomeTextField.addActionListener(e -> mediator.widgetCambiato(cognomeTextField));

        salvaButton.addActionListener(e -> mediator.widgetCambiato(salvaButton));

        frame.add(new JLabel("Nome:"));
        frame.add(nomeTextField);
        frame.add(new JLabel("Cognome:"));
        frame.add(cognomeTextField);
        frame.add(salvaButton);

        frame.pack();
        frame.setVisible(true);
    }
}

