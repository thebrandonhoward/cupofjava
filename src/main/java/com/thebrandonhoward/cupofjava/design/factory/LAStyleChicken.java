package com.thebrandonhoward.cupofjava.design.factory;

public class LAStyleChicken implements Taco {
    @Override
    public void prepare() {
        System.out.println("LA Style Chicken");
    }
}