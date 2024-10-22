package com.thebrandonhoward.cupofjava.design.adapter;

import com.thebrandonhoward.cupofjava.design.strategy.Duck;

public class DuckSimulatorAdapter extends Duck {
    private Drone drone;

    public DuckSimulatorAdapter(Drone drone) {
        this.drone = drone;
    }
    @Override
    public void performQuack() {
        this.drone.beep();
    }

    @Override
    public void performFly() {
        this.drone.spin_rotors();
        this.drone.take_off();
    }

    @Override
    public void display() {

    }
}
