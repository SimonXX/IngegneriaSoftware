package designPatterns.FactoryMethod.FactoryParametrico;

public class Application {
    private DocumentIF document;
    private DocumentFactoryIF documentFactory;

    public void requestCreation(String type) {
        document = documentFactory.createDocument(type);
    }

    public void newDocument() {
        document = new MyDocument("Nuovo documento");
    }

    public void openDocument() {
        document.openDocument();
    }

    public void setDocumentFactory(DocumentFactoryIF documentFactory) {
        this.documentFactory = documentFactory;
    }

    public DocumentIF getDocument() {
        return document;
    }
}
