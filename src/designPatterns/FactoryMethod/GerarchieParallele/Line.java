package designPatterns.FactoryMethod.GerarchieParallele;

class Line implements Figure {
    public Manipulator createManipulator() {
        return new LineManipulator();
    }
}