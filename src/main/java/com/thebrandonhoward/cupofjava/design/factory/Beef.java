package com.thebrandonhoward.cupofjava.design.factory;

public class Beef implements Taco {
    @Override
    public void prepare() {
        System.out.println("Prepare beef taco");
    }
}