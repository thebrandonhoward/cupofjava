package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(0.20));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}

