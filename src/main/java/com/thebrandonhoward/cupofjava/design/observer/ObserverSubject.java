package com.thebrandonhoward.cupofjava.design.observer;

public interface ObserverSubject {
    void notifyObservers();
    void removeObserver(Observer observer);
    void registerObserver(Observer observer);
}
