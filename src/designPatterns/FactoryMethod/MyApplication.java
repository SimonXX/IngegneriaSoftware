package designPatterns.FactoryMethod;

public class MyApplication extends Application{
    // Implementazione del metodo factory per la creazione di un documento di tipo TextDocument
    protected Document createDocument() {
        return new MyDocument();
    }
}
