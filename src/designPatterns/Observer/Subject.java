package designPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int stato;

    public int getStato() {
        return stato;
    }

    public void setStato(int stato) {
        this.stato = stato;
        notificaObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notificaObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}