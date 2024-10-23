package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(0.15));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
