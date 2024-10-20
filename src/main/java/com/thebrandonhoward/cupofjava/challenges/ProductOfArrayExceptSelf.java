package com.thebrandonhoward.cupofjava.challenges;

import java.util.Arrays;

//7 | https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
public class ProductOfArrayExceptSelf {
    public static void main(String... args) {
        /*
        1,2,3,4

        1,2,6,24
        24,24,12,4

        24,12,8,6

        ------------

        -1,1,0,-3,3

        -1,-1,0,0,0
         0,0,0,-9,3

         0,0,9,0,0
         */

        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefixes = new int[nums.length];
        int[] postfixes = new int[nums.length];
        int[] outNums = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                prefixes[i] = nums[i];
                postfixes[nums.length - 1] = nums[nums.length - 1];
                outNums[i] = postfixes[i + 1];
            }
            else {
                prefixes[i] = nums[i] * prefixes[i-1];
                postfixes[nums.length - i - 1] = postfixes[nums.length - i ] * nums[nums.length - i - 1];

                if(i == nums.length - 1) {
                    outNums[i] = prefixes[i - 1];
                }
                else {
                    outNums[i] = prefixes[i - 1] * postfixes[i + 1];
                    postfixes[nums.length - i - 1] = postfixes[nums.length - i] * nums[nums.length - i - 1];
                }
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                outNums[i] = postfixes[i + 1];
            }
            else if(i == nums.length - 1) {
                outNums[i] = prefixes[i - 1];
            }
            else {
                outNums[i] = prefixes[i - 1] * postfixes[i + 1];
                postfixes[nums.length - i - 1] = postfixes[nums.length - i] * nums[nums.length - i - 1];
            }
        }

        return outNums;
    }


}
