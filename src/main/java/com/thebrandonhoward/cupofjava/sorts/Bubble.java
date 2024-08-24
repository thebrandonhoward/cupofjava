package com.thebrandonhoward.cupofjava.sorts;
public class Bubble {
    public static void main(String[] args) {
        int[] input = { 5, 3, 1, 4, 2, 7, 6,};

        print(input);

        bubbleSort(input);

        print(input);
    }

    public static void bubbleSort(int[] input) {
        boolean didSwap = false;
        for(int i = 0; i < input.length - 1; i++) {
            for(int j = input.length - 1; j > i; j--) {

                if(input[j] < input[j-1]) {
                    swap(input, j, j-1);

                    print(input);

                    didSwap = true;
                }
            }

            if(!didSwap)
                return;

            didSwap = false;
        }

    }

    public static void swap(int[] input, int from, int to) {
        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;
    }

    public static void print(int[] input) {
        System.out.print("{ ");

        for(int v : input) {
            System.out.print(v + " ");
        }

        System.out.print("}");
        System.out.println("");
    }

}