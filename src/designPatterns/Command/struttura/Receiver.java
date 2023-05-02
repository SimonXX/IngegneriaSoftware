package designPatterns.Command.struttura;

public class Receiver {
    public void action(String state) {
        System.out.println("Receiver.action() called with state: " + state);
    }
}
