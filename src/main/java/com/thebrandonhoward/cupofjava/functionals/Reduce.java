package com.thebrandonhoward.cupofjava.functionals;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Reduce {

    public static void main(String[] args) {
        doReduce(new int[] {-1, 10, 9, 10, 10, });
    }

    static void doReduce(int[] inputArray) {
        int result = Arrays.stream( inputArray )
                            .filter( grade -> grade > 0 )
                            .map( grade -> Math.multiplyExact(grade, 10) )
                            .reduce( 0, Integer::sum );

        System.out.println(result);
    }

}
