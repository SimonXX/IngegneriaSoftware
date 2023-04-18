package designPatterns.InheritanceDelegation.Inheritance;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println("Numero inserimenti = " + s.getAddCount()); //stampa 6 -> errato!

    }
}
