package com.thebrandonhoward.cupofjava.design.factory;

public class Chicken implements Taco {
    @Override
    public void prepare() {
        System.out.println("Prepare chicken taco");
    }
}
