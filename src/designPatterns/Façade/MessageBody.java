package designPatterns.Façade;

public class MessageBody {
    private String messageText;
    private Attachment attachment;

    public MessageBody(String messageText, Attachment attachment) {
        this.messageText = messageText;
        this.attachment = attachment;
    }
}
