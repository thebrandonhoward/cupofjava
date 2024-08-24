package com.thebrandonhoward.cupofjava.sorts;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] in = { 0, 9, 1, 6, 7, 3, 5, 2, 4, 8};
        System.out.println(Arrays.toString(in));

        System.out.println(Arrays.toString(in));
    }

    public void mergeSort(int[] in, int size) {
        if(size == 1)
            return;

        int midIndex = (size / 2) - 1;

        mergeSort(in, midIndex);
        mergeSort(in, midIndex + 1);
    }
}
