package designPatterns.Composite;

public class Line  implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing a line");
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