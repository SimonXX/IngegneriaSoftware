package designPatterns.Façade;

public class Message {
    private MessageHeader header;
    private MessageBody body;

    public Message(String messageText) {
        // Inizializzazione del messaggio
    }

    public void setHeader(MessageHeader header) {
        this.header = header;
    }

    public void setBody(MessageBody body) {
        this.body = body;
    }

    // Resto dell'implementazione della classe Message
}
