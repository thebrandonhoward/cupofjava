package com.thebrandonhoward.cupofjava.challenges;

//8 | https://leetcode.com/problems/increasing-triplet-subsequence/submissions/1428791646/?envType=study-plan-v2&envId=leetcode-75
public class IncreasingTripletSubsequence {
    public static void main(String... args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int firstPlace = Integer.MAX_VALUE;
        int secondPlace = firstPlace;

        if(nums.length < 3)
            return false;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] <= firstPlace)
                firstPlace = nums[i];
            else if(nums[i] <= secondPlace)
                secondPlace = nums[i];
            else
                return true;
        }

        return false;
    }
}
