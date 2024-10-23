package com.thebrandonhoward.cupofjava.design.observer;

import java.util.Objects;

public class UserInterface implements Observer {
    private String display = null;
    private final ObserverSubject observerSubject;

    public  UserInterface(ObserverSubject observerSubject) {
        this.observerSubject = observerSubject;
        this.observerSubject.registerObserver(this);
    }

    public void display() {
        System.out.println(this.display);
    }

    @Override
    public void update(double temperature, double pressure, double windSpeed) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName()).append(":").append(temperature).append(":").append(pressure).append(":").append(windSpeed);

        this.display = sb.toString();

        display();
    }

    @Override
    public void close() {
        if(Objects.nonNull(this.observerSubject))
            observerSubject.removeObserver(this);
    }
}
