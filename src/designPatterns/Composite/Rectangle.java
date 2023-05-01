package designPatterns.Composite;

public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void add(Graphic graphic) {
        // unsupported operation for primitive objects
    }

    @Override
    public void remove(Graphic graphic) {
        // unsupported operation for primitive objects
    }

    @Override
    public Graphic getChild(int index) {
        // unsupported operation for primitive objects
        return null;
    }
}