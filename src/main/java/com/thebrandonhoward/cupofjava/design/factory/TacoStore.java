package com.thebrandonhoward.cupofjava.design.factory;

public abstract class TacoStore {
    abstract Taco createTaco(String type);

    public Taco orderTaco(String type) {
        Taco taco = createTaco(type);
        System.out.println("Making a " + taco.getClass().getName());

        taco.prepare();

        return taco;
    }
}
