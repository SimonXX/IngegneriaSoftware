package designPatterns.Adapter.ClassAdapter;

import designPatterns.Adapter.Figure2D;
import designPatterns.Adapter.XXXTriangle;

public class Triangle extends XXXTriangle implements Figure2D {
    public Triangle(double lato1, double lato2, double lato3) {
        super(lato1, lato2, lato3);
    }

    @Override
    public double area(){
        return super.computeArea();
    }

    @Override
    public double perimeter(){
        return super.computePerimeter();
    }


}
