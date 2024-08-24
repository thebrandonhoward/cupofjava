package com.thebrandonhoward.cupofjava.sorts;
public class Selection {
    public static void main(String[] args) {
        int[] input = {5, 3, 1, 4, 2, };

        print(input);

        selectionSort(input);

        print(input);
    }

    public static void selectionSort(int[] input) {

        for(int i = 0; i < input.length - 1; i++) {
            for(int j = i + 1; j < input.length; j++) {

                if (input[j] < input[i]) {
                    swap(input, i, j);
                    print(input);
                }
            }
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