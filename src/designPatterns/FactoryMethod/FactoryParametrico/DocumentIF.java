package designPatterns.FactoryMethod.FactoryParametrico;

public interface DocumentIF {
    String getTitle();
    DocumentIF newDocument();
    void openDocument();
}