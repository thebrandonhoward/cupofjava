package com.thebrandonhoward.cupofjava.design.observer;

import java.util.Objects;

public class Logger implements Observer {
    private String log = null;
    private final ObserverSubject observerSubject;

    public Logger(ObserverSubject observerSubject) {
        this.observerSubject = observerSubject;
        this.observerSubject.registerObserver(this);
    }

    public void log() {
        System.out.println(this.log);
    }

    @Override
    public void update(double temperature, double pressure, double windSpeed) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName()).append(":").append(temperature).append(":").append(pressure).append(":").append(windSpeed);

        this.log = sb.toString();

        log();
    }

    @Override
    public void close() {
        if(Objects.nonNull(this.observerSubject))
            observerSubject.removeObserver(this);
    }
}
