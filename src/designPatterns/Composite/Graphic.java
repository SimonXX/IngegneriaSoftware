package designPatterns.Composite;

public interface Graphic {
    void draw();
    void add(Graphic graphic);
    void remove(Graphic graphic);
    Graphic getChild(int index);
}
