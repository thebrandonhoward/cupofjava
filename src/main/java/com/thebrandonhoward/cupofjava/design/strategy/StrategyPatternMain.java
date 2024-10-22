package com.thebrandonhoward.cupofjava.design.strategy;

public class StrategyPatternMain {
    public static void main(String... args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.display();

        Duck daffyDuck = new DaffyDuck();
        daffyDuck.performFly();
        daffyDuck.performQuack();
        daffyDuck.swim();
        daffyDuck.display();

        Duck mallardDuck2 = new MallardDuck(new FlyWithWings(), new Quack());
        mallardDuck2.performFly();
        mallardDuck2.performQuack();
        mallardDuck2.swim();
        mallardDuck2.display();

        Duck daffyDuck2 = new DaffyDuck(new FlyWithoutWings(), new Squeak());
        daffyDuck2.performFly();
        daffyDuck2.performQuack();
        daffyDuck2.swim();
        daffyDuck2.display();
    }
}
