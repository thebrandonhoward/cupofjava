package com.thebrandonhoward.cupofjava.design.factory;

public class FactoryMethodMain {
    public static void main(String... args) {
        TacoStore tacoStore = new LATacoStore();
        tacoStore.orderTaco("Fish");

        tacoStore = new MexicanTacoStore();
        tacoStore.orderTaco("Beef");
    }
}
