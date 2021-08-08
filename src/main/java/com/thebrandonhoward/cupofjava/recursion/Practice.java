package com.thebrandonhoward.cupofjava.recursion;

public class Practice {

    public static final char[] stringToReverse = {'G','o','C','u','b','s','G','o','!'};

    public static void main(String... args) {

        System.out.printf("\nSize: %d", reverse(stringToReverse, 0));

    }

    public static int reverse(char[] stringToReverse, int inIndex) {

        if( (stringToReverse.length == 0) || (inIndex >= stringToReverse.length) )
            return 0;

        int size = 1 + reverse(stringToReverse, inIndex + 1);

        System.out.print(stringToReverse[inIndex]);

        return size;

    }

}

