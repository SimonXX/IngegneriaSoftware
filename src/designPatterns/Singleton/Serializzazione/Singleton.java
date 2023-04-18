package designPatterns.Singleton.Serializzazione;

import java.io.Serializable;

public final class Singleton implements Serializable {

    private static Singleton INSTANCE = null;

    private Singleton() {
        // private constructor
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }


    //se avesse un nome diverso, non verrebbe invocato e l'hashcode delle istanze risulterebbe, nel main, differente
    private Object readResolve() {
        return getInstance();
    }
}