package com.thebrandonhoward.cupofjava.sorts;

public class QuickSort {

    public static final int[] listToSort = {892892,3,4,8,1092,134,897,0342,789,0243,789,243,};

    public static void main(String... args) {

        print();

        quickSort(listToSort, 0, listToSort.length - 1);

        print();

    }

    public static void quickSort(int[] listToSort, int inLow, int inHigh) {

        if(inLow >= inHigh)
            return;

        int pivotIndex = partition(listToSort, inLow, inHigh);

        quickSort(listToSort, inLow, pivotIndex - 1);

        quickSort(listToSort, pivotIndex + 1, inHigh);

    }

    public static int partition(int[] listToSort, int inLow, int inHigh) {

        int pivotValue = listToSort[inLow];
        int lowIndex = inLow;
        int highIndex = inHigh;

        while(lowIndex < highIndex) {

            while( (listToSort[lowIndex] <= pivotValue) && (lowIndex < highIndex) ) {
                lowIndex++;
            }

            while(listToSort[highIndex] > pivotValue) {
                highIndex--;
            }

            if(lowIndex < highIndex) {
                swap(listToSort, lowIndex, highIndex);
            }

        }

        swap(listToSort, inLow, highIndex);

        return highIndex;

    }

    public static void swap(int[] listToSort, int inLow, int inHigh) {

        int tempValue = listToSort[inLow];
        listToSort[inLow] = listToSort[inHigh];
        listToSort[inHigh] = tempValue;

    }

    public static void print() {

        for(int i : listToSort) {
            System.out.printf("%d, ", i);
        }
        System.out.println();

    }
}
