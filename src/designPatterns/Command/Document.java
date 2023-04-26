package designPatterns.Command;


//Receiver
public class Document {

    private boolean isOpen;

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Il documento è stato aperto");
        } else {
            System.out.println("Il documento è già aperto");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Il documento è stato chiuso");
        } else {
            System.out.println("Il documento è già chiuso");
        }
    }

    //altri metodi per copiare, tagliare ed incollare

}
