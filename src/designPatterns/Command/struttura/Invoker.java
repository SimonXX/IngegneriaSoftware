package designPatterns.Command.struttura;

public class Invoker {
    private Command command;

    public void handle(Command cmd) {//possiamo passare anche un MacroCommand
        this.command = cmd;
        this.command.execute();
    }
}
