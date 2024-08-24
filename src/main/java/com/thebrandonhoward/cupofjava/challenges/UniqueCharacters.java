package com.thebrandonhoward.cupofjava.challenges;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "a";
        System.out.println(hasUniqueCharacters(input));

        input = "aa";
        System.out.println(hasUniqueCharacters(input));

        input = "abaa";
        System.out.println(hasUniqueCharacters(input));

        input = "abcd";
        System.out.println(hasUniqueCharacters(input));

        input = "abdd";
        System.out.println(hasUniqueCharacters(input));

        input = "abca";
        System.out.println(hasUniqueCharacters(input));

    }

    //a
    //aa
    //abaa
    public static boolean hasUniqueCharacters(String input) {
        int size = input.length();

        if(size < 2)
            return false;

        for(int i = 0; i < size - 1; i++) {
            for(int j = i + 1; j < size; j++) {
                if(input.charAt(i) == input.charAt(j))
                    return true;
            }
        }

        return false;

    }
}