package designPatterns.Singleton.Serializzazione;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;

        // Serializzazione dell'oggetto Singleton
        try {
            FileOutputStream fileOut = new FileOutputStream("singleton.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in singleton.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserializzazione dell'oggetto Singleton
        try {
            FileInputStream fileIn = new FileInputStream("singleton.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            s2 = (Singleton) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Singleton class not found");
            c.printStackTrace();
        }

        // Verifica che s1 e s2 siano la stessa istanza
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2));
    }
}
