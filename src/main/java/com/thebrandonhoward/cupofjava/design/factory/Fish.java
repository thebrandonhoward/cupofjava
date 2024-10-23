package com.thebrandonhoward.cupofjava.design.factory;

public class Fish implements Taco {
    @Override
    public void prepare() {
        System.out.println("Prepare fish taco");
    }
}
