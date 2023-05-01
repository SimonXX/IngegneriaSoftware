package designPatterns.Observer.ObserverMoreSubjects;

public class ConcreteSubject1 extends Subject{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
