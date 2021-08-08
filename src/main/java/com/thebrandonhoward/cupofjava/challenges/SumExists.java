package com.thebrandonhoward.cupofjava.challenges;

import java.util.HashMap;

public class SumExists {

    public static void main(String[] args) {
        int[] searchArray = {5,3,4,7,2};
        int targetSum = 7;
        System.out.printf("Does a sum of 7 exist? %s \n", doesSumExist(targetSum, searchArray, new HashMap<Integer,Boolean>()));

        int[] searchArray2 = {5,3,};
        targetSum = 4;
        System.out.printf("Does a sum of 4 exist? %s \n", doesSumExist(targetSum, searchArray2, new HashMap<Integer,Boolean>()));

        targetSum = 7777;
        System.out.printf("Does a sum of 7777 exist? %s \n", doesSumExist(targetSum, searchArray, new HashMap<Integer,Boolean>()));

        int[] searchArray3 = {7,14,};
        targetSum = 300;
        System.out.printf("Does a sum of 300 exist? %s \n", doesSumExist(targetSum, searchArray3, new HashMap<Integer,Boolean>()));

        targetSum = 7_777;
        System.out.printf("Does a sum of 7777 exist? %s \n", doesSumExist(targetSum, searchArray3, new HashMap<Integer,Boolean>()));
    }

    public static boolean doesSumExist(int targetSum, int[] searchArray, HashMap<Integer,Boolean> memo) {
        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) return true;
        if(targetSum < 0) return false;

        for(int i = 0; i < searchArray.length; i++) {
            int remainder = targetSum - searchArray[i];

            boolean exists = doesSumExist(remainder, searchArray, memo);

            if(exists) {
                memo.put(targetSum, exists);
                return exists;
            }
        }

        memo.put(targetSum, false);
        return false;
    }

}
