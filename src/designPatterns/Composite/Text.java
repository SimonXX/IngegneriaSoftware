package designPatterns.Composite;

public class Text implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing some text");
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
