package designPatterns.FactoryMethod.GerarchieParallele;

public class Main {
    public static void main(String[] args) {
        Figure line = new Line();
        Figure image = new Image();

        Manipulator lineManipulator = line.createManipulator();
        Manipulator imageManipulator = image.createManipulator();

        lineManipulator.click();
        imageManipulator.drag();
    }
}
