package designPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Modifico lo stato dell'originator e salvo un Memento
        originator.setState("Stato 1");
        caretaker.addMemento(originator.saveToMemento());

        // Modifico lo stato dell'originator e salvo un altro Memento
        originator.setState("Stato 2");
        caretaker.addMemento(originator.saveToMemento());

        // Modifico lo stato dell'originator ma voglio tornare indietro al primo stato
        originator.setState("Stato 3");
        System.out.println("Originator: Stato corrente: " + originator.getState());

        // Ripristino lo stato precedente a partire dal Memento salvato in precedenza
        originator.restoreFromMemento(caretaker.getMemento());
        System.out.println("Originator: Stato ripristinato a: " + originator.getState());

        // Ripristino nuovamente lo stato precedente
        originator.restoreFromMemento(caretaker.getMemento());
        System.out.println("Originator: Stato ripristinato a: " + originator.getState());
    }
}
