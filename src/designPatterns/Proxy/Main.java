package designPatterns.Proxy;

public class Main {

    public static void main(String[] args){
        // Creazione di un proxy per un'immagine
        Graphic image = new ImageProxy("test.jpg");

        // L'immagine non è ancora stata caricata
        System.out.println("Prima visualizzazione");
        image.display();

        // L'immagine è già stata caricata, non viene caricata nuovamente
        System.out.println("Seconda visualizzazione");
        image.display();
    }
}
