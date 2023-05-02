package designPatterns.Command.struttura;

public class Invoker {
    private Command command;

    public void handle(Command cmd) {
        this.command = cmd;
        this.command.execute();
    }
}
