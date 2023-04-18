package designPatterns.Adapter;

import designPatterns.Adapter.ObjectAdapter.Triangle;

public class Main {

    public static void main(String[] args){

        Figure2D figure1 = new Rectangle(3.0, 7.0);
        Figure2D figure2 = new Circle(3.0);

        Figure2D figure3 = new Triangle(3, 4, 5);

        double area1 = figure1.area();

        System.out.format("Area del rettangolo: %.2f%n", area1);

        double area2 = figure2.area();


        System.out.format("Area del cerchio: %.2f%n", area2);

        double area3 = figure3.area();


        System.out.format("Area del triangolo: %.2f%n", area3);


    }
}
