package designPatterns.Builder;

public class Director {

    private BuilderIF builder;

    public void build (BuilderIF builder) {
        this.builder = builder;
        construct();
    }

    private void construct(){
        builder.buildPartA();
        builder.buildPartB();
    }

    //il Director non ha il metodo *getProduct()* in quanto non lo si vuole legare alla rappresentazione dell'oggetto

}
