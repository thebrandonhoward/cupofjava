package com.thebrandonhoward.cupofjava.design.decorator;

public class DecoratorMain {
    public static void main(String... args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);
        beverage = new Milk(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
