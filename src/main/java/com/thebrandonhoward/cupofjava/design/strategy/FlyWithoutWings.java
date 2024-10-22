package com.thebrandonhoward.cupofjava.design.strategy;

public class FlyWithoutWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly without wings.");
    }
}
