package designPatterns.Adapter.ObjectAdapter;

import designPatterns.Adapter.Figure2D;
import designPatterns.Adapter.XXXTriangle;

public class Triangle implements Figure2D {

    private XXXTriangle triangle;

    private double lato1, lato2, lato3;

    public Triangle(double lato1, double lato2, double lato3) {

        this.triangle = new XXXTriangle(lato1, lato2, lato3);
    }

    @Override
    public double area() {
        return triangle.computeArea();
    }

    @Override
    public double perimeter() {
        return triangle.computePerimeter();
    }
}
