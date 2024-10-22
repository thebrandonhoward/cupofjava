package com.thebrandonhoward.cupofjava.design.strategy;

import java.util.Objects;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {}

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    abstract void display();

    public void performFly() {
        if(Objects.isNull(this.flyBehavior))
            System.out.println("Default flying.");
        else
            this.flyBehavior.fly();
    }

    public void performQuack() {
        if(Objects.isNull(this.quackBehavior))
            System.out.println("Default quacking.");
        else
            this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming in circles.");
    }
}
