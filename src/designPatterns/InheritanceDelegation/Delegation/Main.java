package designPatterns.InheritanceDelegation.Delegation;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<String>());

        s.addAll(Arrays.asList("Primo", "Secondo", "Terzo"));

        System.out.println("Numero inserimenti: " + s.getAddCount());

        for(String item: s){
            System.out.println(item);
        }




    }
}
