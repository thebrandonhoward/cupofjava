package com.thebrandonhoward.cupofjava.design.factory;

public class LAStyleVeggie implements Taco {
    @Override
    public void prepare() {
        System.out.println("LA Style No Meat");
    }
}