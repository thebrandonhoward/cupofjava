package com.thebrandonhoward.cupofjava.design.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherStation implements ObserverSubject {
    private List<Observer> observers = new ArrayList<>();

    private double temperature;
    private double windSpeed;
    private double pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public void notifyObservers() {
        if(Objects.isNull(observers))
            return;

        observers.forEach(o -> {
            o.update(this.temperature, this.pressure, this.windSpeed);
        });
    }

    @Override
    public void removeObserver(Observer observer) {
        if(Objects.nonNull(observers) && Objects.nonNull(observer))
            observers.remove(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        if(Objects.isNull(observers))
            this.observers = new ArrayList<>();

        if(Objects.nonNull(observer)) {
            if(!observers.contains(observer))
                observers.add(observer);
        }
    }
}
