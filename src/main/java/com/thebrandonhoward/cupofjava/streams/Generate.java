package com.thebrandonhoward.cupofjava.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Generate {
    public static void main(String... args) {
        Stream.generate(stringSupplier)
                .limit(10)
                .forEach(System.out::println);
    }

    static Supplier<String> stringSupplier = () -> Double.toHexString(Math.random());

}
