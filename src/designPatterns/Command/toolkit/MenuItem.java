package designPatterns.Command.toolkit;

public class MenuItem {//Invoker
    private final String name;
    private final Command command;

    public MenuItem(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void execute() {
        command.execute();
    }//l'invoker richiede all'istanza di command di eseguire l'operazione
}
