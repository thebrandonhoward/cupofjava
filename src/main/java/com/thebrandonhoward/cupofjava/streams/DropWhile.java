package com.thebrandonhoward.cupofjava.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhile {
    public static void main(String... args) {
        List<Number> collect = numberStream()
                .dropWhile(i -> i.intValue() < 2)
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    static Stream<Number> numberStream() {
        return Stream.of(0,1,1,1,1,1,1,1,2,3,4,5,6,7,8,9);
    }
}
