package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(0.10));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
