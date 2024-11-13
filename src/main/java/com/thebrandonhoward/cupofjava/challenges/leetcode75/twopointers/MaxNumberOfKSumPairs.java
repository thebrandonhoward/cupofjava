package com.thebrandonhoward.cupofjava.challenges.leetcode75.twopointers;

import java.util.HashSet;
import java.util.Set;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));
        System.out.println(maxOperations(new int[]{3,1,5,1,1,1,1,1,2,2,3,2,2} , 1));
    }
    public static int maxOperations(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        Set<Integer> visitedSet = new HashSet<>();

        int operationsSum = 0;

        int i = 0;
        int j = nums.length - 1;

        while(i < j) {
            if(!visitedSet.contains(nums[i]))
                numsSet.add(nums[i]);

            if(!visitedSet.contains(nums[j]))
                numsSet.add(nums[j]);

            if(numsSet.contains(Math.max(nums[i],k) - Math.min(nums[i],k))) {
                if(!visitedSet.contains(nums[i])) {
                    operationsSum += 1;
                    numsSet.remove(nums[i]);
                    visitedSet.add(nums[i]);
                }
            }

            if(numsSet.contains(Math.max(nums[j],k) - Math.min(nums[j],k))) {
                if(!visitedSet.contains(nums[j])) {
                    operationsSum += 1;
                    numsSet.remove(nums[j]);
                    visitedSet.add(nums[j]);
                }
            }

            i++;
            j--;
        }

        return operationsSum;
    }
}