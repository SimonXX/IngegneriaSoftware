package designPatterns.Command.struttura;

public class ConcreteCommand implements Command{
    private Receiver receiver;
    private String state;

    public ConcreteCommand(Receiver receiver, String state) {
        this.receiver = receiver;
        this.state = state;
    }

    public void execute() {
        System.out.println("ConcreteCommand.execute() called");
        this.receiver.action(this.state);
    }
}
