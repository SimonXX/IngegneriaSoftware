package designPatterns.Prototype.ClonareVariandoStruttura;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // definiamo i prototipi delle parti
        Part resistorPrototype = new Resistor("Resistor", 0.1, 100);
        Part capacitorPrototype = new Capacitor("Capacitor", 0.2, 10);

        // creiamo un nuovo circuito

        // possiamo definire nuove parti e sottoparti per creare circuiti più complessi, senza dover creare nuove classi per ogni possibile variazione.
        List<Part> circuit = new ArrayList<>();
        circuit.add(resistorPrototype.clone());
        circuit.add(capacitorPrototype.clone());
        circuit.add(resistorPrototype.clone());

        for (Part c : circuit){
            System.out.println((c));
        }

        double circuitPrice = circuit.stream().mapToDouble(Part::getPrice).sum();
        System.out.println("Circuit price: " + circuitPrice);


    }
}
