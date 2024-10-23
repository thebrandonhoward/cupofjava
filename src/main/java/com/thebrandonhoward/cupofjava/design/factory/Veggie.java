package com.thebrandonhoward.cupofjava.design.factory;

public class Veggie implements Taco {
    @Override
    public void prepare() {
        System.out.println("No meat");
    }
}
