package designPatterns.Façade;

public class Client {
    public static void main(String[] args) {
        MessageCreator messageCreator = new MessageCreator();
        messageCreator.createAndSendMessage("recipient@example.com", "Hello, World!", "attachment.pdf");
    }
}
