package designPatterns.Command;

//ConcreteCommand
public class OpenDocumentCommand implements Command {


    private final Document document;

    public OpenDocumentCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.open();
    }
}
