package com.thebrandonhoward.cupofjava.design.adapter;

import com.thebrandonhoward.cupofjava.design.strategy.Duck;
import com.thebrandonhoward.cupofjava.design.strategy.MallardDuck;

public class DuckSimulator {
    public static void main(String... args) {
        Duck duck = new MallardDuck();
        testDuck(duck);

        Drone superDrone = new SuperDrone();
        Duck duckSimulatorAdapter = new DuckSimulatorAdapter(superDrone);

        testDuck(duckSimulatorAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }

}
