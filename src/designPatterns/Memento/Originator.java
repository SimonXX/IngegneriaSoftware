package designPatterns.Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: imposto lo stato a " + state);
    }

    public Memento save() {
        System.out.println("Originator: salvo lo stato.");
        return new Memento(state);
    }

    public void restore(Memento m) {
        state = m.getState();
        System.out.println("Originator: ripristino lo stato a " + state);
    }
}
