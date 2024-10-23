package com.thebrandonhoward.cupofjava.design.observer;

public class ObserverMain {
    public static void main(String... args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();
        UserInterface userInterface = new UserInterface(weatherStation);
        Logger logger = new Logger(weatherStation);
        AlertSystem alertSystem = new AlertSystem(weatherStation);

        int i = 3;

        while(i > 0) {
            i--;
            weatherStation.setPressure(Math.random());
            weatherStation.setTemperature(Math.random());
            weatherStation.setWindSpeed(Math.random());
            weatherStation.notifyObservers();

            Thread.sleep(5000);
        }

        userInterface.close();
        logger.close();

        while(i < 3) {
            i++;
            weatherStation.setPressure(Math.random());
            weatherStation.setTemperature(Math.random());
            weatherStation.setWindSpeed(Math.random());
            weatherStation.notifyObservers();

            Thread.sleep(5000);
        }

        alertSystem.close();
        
        while(i > 0) {
            i--;
            weatherStation.setPressure(Math.random());
            weatherStation.setTemperature(Math.random());
            weatherStation.setWindSpeed(Math.random());
            weatherStation.notifyObservers();

            Thread.sleep(5000);
        }
    }
}
