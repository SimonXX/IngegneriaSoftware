package designPatterns.FactoryMethod.FactoryParametrico;

public class MyDocument extends AbstractDocument {
    public MyDocument(String title) {
        super(title);
    }

    public DocumentIF newDocument() {
        return new MyDocument("Nuovo documento");
    }

    public void openDocument() {
        System.out.println("Documento aperto: " + this.title);
    }
}
