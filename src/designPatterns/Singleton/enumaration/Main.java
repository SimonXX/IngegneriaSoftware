package designPatterns.Singleton.enumaration;

public class Main {
    public static void main(String[] args) {
        Singleton.INSTANCE.setMessage("Hello, world!");
        System.out.println(Singleton.INSTANCE.getMessage()); // Output: Hello, world!

        Singleton otherSingleton = Singleton.INSTANCE;
        otherSingleton.setMessage("Goodbye!");
        System.out.println(Singleton.INSTANCE.getMessage()); // Output: Goodbye!
    }
}