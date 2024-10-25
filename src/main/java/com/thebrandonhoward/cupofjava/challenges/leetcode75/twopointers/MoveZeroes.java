package com.thebrandonhoward.cupofjava.challenges.leetcode75.twopointers;

import java.util.Arrays;

//10 | https://leetcode.com/problems/move-zeroes/submissions/1433023675/?envType=study-plan-v2&envId=leetcode-75
public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
    }

    public static void moveZeroes(int[] nums) {
        int leftIndex = 0;
        int rightIndex = 1;

        while(rightIndex < nums.length && leftIndex < nums.length) {
            while(leftIndex < nums.length && nums[leftIndex] !=0) {
                leftIndex++;
            }

            while(rightIndex < nums.length && (rightIndex <= leftIndex || nums[rightIndex] == 0)) {
                rightIndex++;
            }

            if(rightIndex < nums.length && leftIndex < nums.length) {
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}