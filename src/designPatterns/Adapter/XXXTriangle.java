package designPatterns.Adapter;

public class XXXTriangle{

    private double lato1, lato2, lato3;

    public XXXTriangle(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double computeArea(){
        double p = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(p * (p - lato1) * (p - lato2) * (p - lato3));
   }

   public double computePerimeter(){
       return lato1 + lato2 + lato3;
   }

}
