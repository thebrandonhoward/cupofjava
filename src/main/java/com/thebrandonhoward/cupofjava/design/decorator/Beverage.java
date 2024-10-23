package com.thebrandonhoward.cupofjava.design.decorator;

import java.math.BigDecimal;

public abstract class Beverage {
    String description = "Basic Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract BigDecimal cost();
}
