package designPatterns.FactoryMethod.GerarchieParallele;

public class ImageManipulator implements Manipulator {
    public void click() {
        System.out.println("ImageManipulator click");
    }

    public void drag() {
        System.out.println("ImageManipulator drag");
    }
}
