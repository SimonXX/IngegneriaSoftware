package designPatterns.Command.struttura;

public class MainMacroCommand {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command1 = new ConcreteCommand(receiver, "state1");
        ConcreteCommand command2 = new ConcreteCommand(receiver, "state2");
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(command1);
        macroCommand.addCommand(command2);
        Invoker invoker = new Invoker();
        invoker.handle(macroCommand);

    }
}
