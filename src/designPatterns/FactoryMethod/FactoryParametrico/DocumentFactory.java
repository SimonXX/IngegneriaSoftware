package designPatterns.FactoryMethod.FactoryParametrico;

public class DocumentFactory implements DocumentFactoryIF {
    public DocumentIF createDocument(String type) {
        if (type.equals("MyDocument")) {
            return new MyDocument("Nuovo documento");
        } else {
            return null;
        }
    }
}