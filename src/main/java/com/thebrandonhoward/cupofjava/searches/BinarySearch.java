package com.thebrandonhoward.cupofjava.searches;

public class BinarySearch {

    public static final int[] sortedList = {3, 4, 8, 134, 163, 226, 243, 789, 789, 897, 1092, 892892};


    public static void main(String[] args) {

        int searchValue = 892892;

        System.out.printf("Index of %d is %d \n", searchValue, binarySearch(sortedList, searchValue));
    }

    public static int binarySearch(int[] sortedList, int searchValue) {

        int lowIndex = 0;
        int highIndex = sortedList.length - 1;

        while(lowIndex <= highIndex) {

            int midIndex = lowIndex + (highIndex - lowIndex) / 2;

            if(sortedList[midIndex] == searchValue)
                return midIndex;

            if(sortedList[midIndex] < searchValue)
                lowIndex = midIndex + 1;
            else
                highIndex = midIndex - 1;

        }

        return -1;

    }

}
