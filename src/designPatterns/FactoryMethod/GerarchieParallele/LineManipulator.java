package designPatterns.FactoryMethod.GerarchieParallele;

public class LineManipulator implements Manipulator {
    public void click() {
        System.out.println("LineManipulator click");
    }

    public void drag() {
        System.out.println("LineManipulator drag");
    }
}