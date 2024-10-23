package com.thebrandonhoward.cupofjava.design.factory;

public class SimpleTacoFactory {
    public static Taco createTaco(String type) {
        return switch (type) {
            case "Chicken" -> new Chicken();
            case "Beef" -> new Beef();
            case "Fish" -> new Fish();
            default -> new Veggie();
        };
    }
}
