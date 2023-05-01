package designPatterns.Observer.ObserverMoreSubjects;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject1 subject1 = new ConcreteSubject1();
        ConcreteSubject2 subject2 = new ConcreteSubject2();

        ConcreteObserver observer1 = new ConcreteObserver("Observer1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer2");

        subject1.attach(observer1);
        subject2.attach(observer1);
        subject2.attach(observer2);

        subject1.setState("State1");
        subject2.setValue(42);
    }
}
