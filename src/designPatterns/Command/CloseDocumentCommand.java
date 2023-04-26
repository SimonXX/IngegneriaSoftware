package designPatterns.Command;


//ConcreteCommand
public class CloseDocumentCommand implements Command{
    private final Document document;

    public CloseDocumentCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.close();
    }
}
