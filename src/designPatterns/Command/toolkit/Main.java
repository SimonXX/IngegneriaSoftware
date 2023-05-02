package designPatterns.Command.toolkit;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        Application application = new Application(document);
        application.showMenu();
    }
}
