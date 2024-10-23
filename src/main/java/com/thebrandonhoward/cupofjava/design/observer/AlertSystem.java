package com.thebrandonhoward.cupofjava.design.observer;

import java.util.Objects;

public class AlertSystem implements Observer {
    private String alert = null;
    private final ObserverSubject observerSubject;

    public AlertSystem(ObserverSubject observerSubject) {
        this.observerSubject = observerSubject;
        this.observerSubject.registerObserver(this);
    }

    public void alert() {
        System.out.println(this.alert);
    }


    @Override
    public void update(double temperature, double pressure, double windSpeed) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName()).append(":").append(temperature).append(":").append(pressure).append(":").append(windSpeed);

        this.alert = sb.toString();

        alert();
    }

    @Override
    public void close() {
        if(Objects.nonNull(this.observerSubject))
            observerSubject.removeObserver(this);
    }
}
