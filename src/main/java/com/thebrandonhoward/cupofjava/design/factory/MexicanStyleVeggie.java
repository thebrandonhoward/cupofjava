package com.thebrandonhoward.cupofjava.design.factory;

public class MexicanStyleVeggie implements Taco {
    @Override
    public void prepare() {
        System.out.println("Mexican Style No Meat");
    }
}
