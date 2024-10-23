package com.thebrandonhoward.cupofjava.design.factory;

public class MexicanStyleFish implements Taco {
    @Override
    public void prepare() {
        System.out.println("Mexican Style Fish");
    }
}
