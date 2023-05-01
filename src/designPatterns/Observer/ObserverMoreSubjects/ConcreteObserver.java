package designPatterns.Observer.ObserverMoreSubjects;


public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject1) {
            System.out.println(name + " has received an update from ConcreteSubject1: " + ((ConcreteSubject1) subject).getState());
        } else if (subject instanceof ConcreteSubject2) {
            System.out.println(name + " has received an update from ConcreteSubject2: " + ((ConcreteSubject2) subject).getValue());
        }
    }
}
