package designPatterns.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        Application application = new MyApplication();
        application.newDocument(); // Output: New document created Text document opened
    }
}
