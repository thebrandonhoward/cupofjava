package com.thebrandonhoward.cupofjava.design.factory;

public class MexicanStyleChicken implements Taco {
        @Override
        public void prepare() {
            System.out.println("Mexican Style Chicken");
        }
}