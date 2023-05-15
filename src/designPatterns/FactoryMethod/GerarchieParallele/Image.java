package designPatterns.FactoryMethod.GerarchieParallele;

class Image implements Figure {
    public Manipulator createManipulator() {
        return new ImageManipulator();
    }
}
