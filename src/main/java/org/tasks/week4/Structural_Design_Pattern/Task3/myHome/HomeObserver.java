package org.tasks.week4.Structural_Design_Pattern.Task3.myHome;


public interface HomeObserver {
    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObservers(String message);
}
