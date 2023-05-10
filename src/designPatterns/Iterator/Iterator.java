package designPatterns.Iterator;

public interface Iterator {
    boolean isDone();
    void next();
    String currentItem();
}
