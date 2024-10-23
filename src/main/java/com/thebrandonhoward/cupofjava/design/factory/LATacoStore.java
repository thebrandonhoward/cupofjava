package com.thebrandonhoward.cupofjava.design.factory;

public class LATacoStore extends TacoStore {
    @Override
    public Taco createTaco(String type) {
        return switch (type) {
            case "Chicken" -> new LAStyleChicken();
            case "Beef" -> new LAStyleBeef();
            case "Fish" -> new LAStyleFish();
            default -> new LAStyleVeggie();
        };
    }
}