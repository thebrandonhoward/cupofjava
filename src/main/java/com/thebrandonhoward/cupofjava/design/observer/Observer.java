package com.thebrandonhoward.cupofjava.design.observer;

public interface Observer {
    void update(double temperature, double pressure, double windSpeed);
    void close();
}
