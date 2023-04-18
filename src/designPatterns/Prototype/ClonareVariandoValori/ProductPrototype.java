package designPatterns.Prototype.ClonareVariandoValori;

import java.util.ArrayList;
import java.util.List;

public class ProductPrototype {

    private List<Prototype> prototypes = new ArrayList<>();

    public void addPrototype(Prototype prototype) {
        prototypes.add(prototype);
    }

    public void removePrototype(Prototype prototype) {
        prototypes.remove(prototype);
    }

    public Prototype createProduct(String name) {
        for (Prototype prototype : prototypes) {
            if (prototype instanceof Product) {
                Product product = (Product) prototype.clone();
                product.setName(name);
                return product;
            }
        }
        return null;
    }
}
