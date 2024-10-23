package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(2.99);
    }
}
