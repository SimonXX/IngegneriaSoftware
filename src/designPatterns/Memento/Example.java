package designPatterns.Memento;

public class Example {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        // Salviamo lo stato corrente dell'originator
        originator.setState("Stato 1");
        caretaker.doSomething();

        // Modifichiamo lo stato dell'originator e salviamo nuovamente lo stato
        originator.setState("Stato 2");
        caretaker.doSomething();

        // Modifichiamo nuovamente lo stato dell'originator
        originator.setState("Stato 3");

        // Ripristiniamo lo stato precedente dall'ultimo salvataggio
        caretaker.undo();

        // Ripristiniamo lo stato ancora una volta
        caretaker.undo();
    }
}
