package com.thebrandonhoward.cupofjava.recursion;

public class Practice2 {
    public static void main(String... args) {
        calculate(12, 7);
    }

    public static void calculate(long dividend, long divisor) {
        if(dividend - divisor <= 1)
            return;

        long quotient = dividend/divisor;
        long remainder = dividend - divisor * quotient;

        System.out.println(dividend + " = " + quotient + " x " + divisor + " + " + remainder);

        calculate(divisor, remainder);
    }
}
