package com.thebrandonhoward.cupofjava.streams;

import java.util.stream.Stream;

public class Concat {
    public static void main(String... args) {

        Stream.concat(letters(), numbers())
                .forEach(System.out::println);

            //Totally pointless way to print an empty line
            Stream.iterate(0, i -> i <= 0, i -> i + 1)
                    .forEach(i -> System.out.println());

        Stream.concat(letters(), numbers())
                .filter(element -> element instanceof Number)
                .forEach(System.out::println);

        //Totally pointless way to print an empty line
        Stream.iterate(0, i -> i <= 0, i -> i + 1)
                    .forEach(i -> System.out.println());

        Stream.concat(letters(), numbers())
                .filter(element -> element instanceof Character)
                .forEach(System.out::println);
    }

    static Stream<Character> letters() {
        return Stream.of('a','b','c');
    }

    static Stream<Number> numbers() {
        return Stream.of(1,2,3);
    }
}
