package com.thebrandonhoward.cupofjava.functionals;

import java.util.List;

class Reduce2 {
    public static void main(String[] args) {
        Long stopWatch = System.currentTimeMillis();

        List<Integer> prices = List.of(2,3,7,3,7,3,7);

        Integer total = prices.stream()
                //.peek(price -> System.out.println("Price1: " + price))
                .map(price -> price * 2)
                //.peek(price -> System.out.println("Price2: " + price))
                .reduce(0, Integer::sum);

        stopWatch = System.currentTimeMillis() - stopWatch;

        System.out.println("Total: $" + total + ".00");
        System.out.println(stopWatch);
    }
}