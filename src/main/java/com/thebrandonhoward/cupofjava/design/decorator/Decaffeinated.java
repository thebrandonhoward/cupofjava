package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public class Decaffeinated extends Beverage {
    public Decaffeinated() {
        description = "Decaffeinated Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99);
    }
}
