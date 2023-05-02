package designPatterns.Command.toolkit;

//ConcreteCommand
public class OpenDocumentCommand implements Command {//ConcreteCommand


    private final Document document;

    public OpenDocumentCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.open();
    }
}
