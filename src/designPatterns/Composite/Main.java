package designPatterns.Composite;

public class Main {

    public static void main(String[] args) {
        Graphic line1 = new Line();
        Graphic line2 = new Line();
        Graphic rectangle1 = new Rectangle();
        Graphic rectangle2 = new Rectangle();
        Graphic text1 = new Text();
        Graphic picture1 = new Picture();
        Graphic picture2 = new Picture();

        // Building the composite structure
        picture1.add(line1);
        picture1.add(rectangle1);
        picture1.add(text1);
        picture2.add(line2);
        picture2.add(rectangle2);
        picture1.add(picture2);

        // Drawing the composite structure
        picture1.draw();

        // Removing a component and drawing again
        picture1.remove(rectangle1);
        System.out.println("\nAfter removing a component:\n");
        picture1.draw();
    }
}
