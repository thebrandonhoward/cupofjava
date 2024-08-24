package com.thebrandonhoward.cupofjava.functionals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PassFunction {

    private static Function<String,String> funcX = x -> doFuncionX(x);
    private static Function<String,String> funcY = y -> doFuncionY(y);

    private static List<String> stringListX = Arrays.asList("GOD","Jesus","Mom","Dad","Family");
    private static List<String> stringListY = Arrays.asList("Lion","Eagle","Bear","Tiger","Elephant");

    public static void main(String... args) {

        execute(stringListX, funcX);
        execute(stringListY, funcY);
    }

    private static String doFuncionX(String input) {
        return input + " of X has " + input.length() + " characters.";
    }

    private static String doFuncionY(String input) {
        return input + " of Y has " + input.length() + " characters.";
    }

    private static void execute(List<String> inputList, Function<String,String> function) {
            inputList.stream()
                    .forEach(input -> System.out.println(function.apply(input)));
    }

}

