package com.thebrandonhoward.cupofjava.design.strategy;

import java.util.Objects;

public class DaffyDuck extends Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    DaffyDuck() {}

    DaffyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    @Override
    void display() {
        System.out.println("Displaying a daffy duck.");
    }

    @Override
    public void performFly() {
        if(Objects.isNull(this.flyBehavior))
            System.out.println("Daffy doesn't fly.");
        else
            this.flyBehavior.fly();
    }

    @Override
    public void performQuack() {
        if(Objects.isNull(this.quackBehavior))
            System.out.println("Daffy doesn't quack.");
        else
            this.quackBehavior.quack();
    }

}