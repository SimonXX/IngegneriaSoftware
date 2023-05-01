package designPatterns.Observer.ObserverMoreSubjects;

import designPatterns.Observer.ChangeManager.ConcreteSubject;

public interface Observer {
    void update(ConcreteSubject subject);

}
