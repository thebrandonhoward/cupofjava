package com.thebrandonhoward.cupofjava.design.strategy;

import java.util.Objects;

public class MallardDuck extends Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    MallardDuck() {}

    MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("Displaying a mallard duck.");
    }

    @Override
    public void performFly() {
        if(Objects.isNull(this.flyBehavior))
            System.out.println("Flying like a mallard.");
        else
            this.flyBehavior.fly();
    }

    @Override
    public void performQuack() {
        if(Objects.isNull(this.quackBehavior))
            System.out.println("Quacking like a mallard.");
        else
            this.quackBehavior.quack();
    }

    @Override
    public void swim() {
        System.out.println("Swimming like a mallard.");
    }
}
