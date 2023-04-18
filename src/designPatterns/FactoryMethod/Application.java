package designPatterns.FactoryMethod;

public abstract class Application {

    // Metodo factory astratto per creare un documento
    protected abstract Document createDocument();

    // Metodo che utilizza il metodo factory per creare un nuovo documento e aprirlo
    public void newDocument() {
        Document document = createDocument();
        System.out.println("New document created");
        document.open();
    }
}
