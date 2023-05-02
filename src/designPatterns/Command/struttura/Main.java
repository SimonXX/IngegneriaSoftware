package designPatterns.Command.struttura;

public class Main {//Client
    public static void main(String[] args) {
        // Creazione dei componenti dell'applicazione
        Receiver receiver = new Receiver();
        ConcreteCommand cmd1 = new ConcreteCommand(receiver, "state1");
        ConcreteCommand cmd2 = new ConcreteCommand(receiver, "state2");
        Invoker invoker = new Invoker();

        // Esecuzione dei comandi tramite l'invoker
        invoker.handle(cmd1);
        invoker.handle(cmd2);//fa eseguire a command l'operazione
        //command invoca il metodo corrispondente sul receiver
        //receiver è il destinatario dell'azione specifica


    }
}
