package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(0.25));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
