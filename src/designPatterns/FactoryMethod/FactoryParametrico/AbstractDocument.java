package designPatterns.FactoryMethod.FactoryParametrico;

public abstract class AbstractDocument implements DocumentIF {
    protected String title;

    public AbstractDocument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}