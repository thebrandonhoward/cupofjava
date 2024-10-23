package com.thebrandonhoward.cupofjava.design.factory;

public class SimpleFactoryMain {
    public static void main(String... args) {
        Taco taco = SimpleTacoFactory.createTaco("Chicken");
        taco.prepare();

        taco = SimpleTacoFactory.createTaco("Beef");
        taco.prepare();

        taco = SimpleTacoFactory.createTaco("Fish");
        taco.prepare();

        taco = SimpleTacoFactory.createTaco("Veggie");
        taco.prepare();

        taco = SimpleTacoFactory.createTaco("Other");
        taco.prepare();
    }
}
