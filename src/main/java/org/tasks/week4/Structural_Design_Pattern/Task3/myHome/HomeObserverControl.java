package org.tasks.week4.Structural_Design_Pattern.Task3.myHome;

import java.util.ArrayList;
import java.util.List;

public class HomeObserverControl implements HomeObserver{

    private List<Observer> observers;

    public HomeObserverControl() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
