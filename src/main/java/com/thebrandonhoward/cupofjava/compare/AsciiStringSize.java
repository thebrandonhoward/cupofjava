package com.thebrandonhoward.cupofjava.compare;

import java.util.Objects;

public class AsciiStringSize {
    public static void main(String ...args) {
        System.out.println(String.format("Does %s come before %s?" , null, "hello")     + compare(null,"hello"));
        System.out.println(String.format("Does %s come before %s?" , "hello", null)     + compare("hello",null));
        System.out.println(String.format("Does %s come before %s?" , "", "")            + compare("",""));
        System.out.println(String.format("Does %s come before %s?" , null, null)        + compare(null,null));
        System.out.println(String.format("Does %s come before %s?" , "hello", "hello")  + compare("hello", "hello"));
        System.out.println(String.format("Does %s come before %s?" , "Hello", "Hello")  + compare("Hello", "Hello"));
        System.out.println(String.format("Does %s come before %s?" , "Hello", "hello")  + compare("Hello", "hello"));
        System.out.println(String.format("Does %s come before %s?" , "hello", "Hello")  + compare("hello", "Hello"));
        System.out.println(String.format("Does %s come before %s?" , "hallo", "hello")  + compare("hallo", "hello"));
        System.out.println(String.format("Does %s come before %s?" , "haaaa", "hc")     + compare("haaaa", "hc"));
        System.out.println(String.format("Does %s come before %s?" , "hello", "helloo") + compare("hello", "helloo"));
        System.out.println(String.format("Does %s come before %s?" , "helli", "hello")  + compare("helli", "hello"));
        System.out.println(String.format("Does %s come before %s?" , "aaaaa", "ac")     + compare("aaaaa", "ac"));
        System.out.println(String.format("Does %s come before %s?" , "ac", "aaaaa")     + compare("ac", "aaaaa"));
    }

    public static int compare(String a, String b) {
        //Validate
        if(Objects.isNull(a) && Objects.isNull(b))
            return 0;
        if(Objects.isNull(a) && Objects.nonNull(b))
            return -1;
        if(Objects.nonNull(a) && Objects.isNull(b))
            return 1;
        if(a.equals(b))
            return 0;

        //Set ASCII offset
        int offset = 97;
        int leftIndex = 0;
        int indexOutOfBounds = a.length() < b.length() ? a.length() - 1 : b.length() - 1;

        //Compare character index size while in bounds
        while(leftIndex <= indexOutOfBounds) {
            //Return when one character index is lower
            if(a.charAt(leftIndex) < b.charAt(leftIndex))
                return -1;
            if(a.charAt(leftIndex) > b.charAt(leftIndex))
                return 1;

            leftIndex++;

            if(leftIndex > indexOutOfBounds)
                return -1;
        }

        return 0;
    }
}
