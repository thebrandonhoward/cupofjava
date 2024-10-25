package com.thebrandonhoward.cupofjava.challenges;

public class FizzBuzz {
    public static void main(String... args) {
        fizzBuzz(15);
        char c = 0;
    }

    public static void fizzBuzz(int n) {
        int index = 1;

        while(index <= n) {
            if((index%3 == 0) && (index%5 == 0))
                System.out.println("FizzBuzz");
//            else if((index%3 == 0) && !(index%5 == 0))
            else if(index%3 == 0)
                System.out.println("Fizz");
//            else if(!(index%3 == 0) && (index%5 == 0))
            else if(index%5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(index);

            index++;
        }
    }
}
