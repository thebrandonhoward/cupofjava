package com.thebrandonhoward.cupofjava.design.factory;

public class MexicanTacoStore extends TacoStore {
    @Override
    public Taco createTaco(String type) {
        return switch (type) {
            case "Chicken" -> new MexicanStyleChicken();
            case "Beef" -> new MexicanStyleBeef();
            case "Fish" -> new MexicanStyleFish();
            default -> new MexicanStyleVeggie();
        };
    }
}
