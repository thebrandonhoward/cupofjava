package com.thebrandonhoward.cupofjava.core;

import lombok.extern.slf4j.Slf4j;

@Slf4j
record VehicleRecord(String make, String model, int year) implements VehicleInterface {
    @Override
    public void display() {
        log.info("{}[make={}, model={}, year={}]", this.getClass().getSimpleName(), make(), model(), year());
    }
}

interface VehicleInterface {
    void display();
}

@Slf4j
class VehicleClass {
    private VehicleRecord vehicleRecord = new VehicleRecord("Dodge", "Ram", 2012);

    public void display() {
        log.info(vehicleRecord.toString());
    }
}

@Slf4j
class VehicleMain {
    public static void main(String[] args) {
        new VehicleClass().display();
        new VehicleRecord("Cadillac", "Escalade", 2023).display();
    }
}