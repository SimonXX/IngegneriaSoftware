package designPatterns.Command.toolkit;


//Receiver

//Crea una istanza concreta
public class Application {//Receiver

    private final Menu fileMenu;
    private final Document document;

    public Application(Document document) {
        this.document = document;

        // Crea il menu "File" e aggiunge le voci di menu
        fileMenu = new Menu("File");
        fileMenu.addMenuItem(new MenuItem("Apri documento", new OpenDocumentCommand(document)));
        fileMenu.addMenuItem(new MenuItem("Chiudi documento", new CloseDocumentCommand(document)));
    }

    public void showMenu() {
        // Mostra il menu "File" e gestisce le selezioni
        fileMenu.show();
    }

}
