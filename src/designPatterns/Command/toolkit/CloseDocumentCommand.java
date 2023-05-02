package designPatterns.Command.toolkit;


//ConcreteCommand
public class CloseDocumentCommand implements Command{//ConcreteCommand
    private final Document document;

    public CloseDocumentCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.close();
    }
}
