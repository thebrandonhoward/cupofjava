package com.thebrandonhoward.cupofjava.design.factory;

public class MexicanStyleBeef implements Taco {
    @Override
    public void prepare() {
        System.out.println("Mexican Style Beef");
    }
}