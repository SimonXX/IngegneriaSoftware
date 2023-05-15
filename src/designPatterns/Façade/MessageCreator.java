package designPatterns.Façade;

public class MessageCreator {
    private Attachment attachment;
    private Security security;
    private MessageSender messageSender;

    public MessageCreator() {
        attachment = new Attachment();
        security = new Security();
        messageSender = new MessageSender();
    }

    public void createAndSendMessage(String recipient, String messageText, String attachmentPath) {
        Attachment attachment = this.attachment.createAttachment(attachmentPath);
        Message message = new Message(messageText);
        message.setHeader(new MessageHeader(recipient));
        message.setBody(new MessageBody(messageText, attachment));
        Message securedMessage = security.encryptMessage(message);
        messageSender.sendMessage(securedMessage);
    }
}
