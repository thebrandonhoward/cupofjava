package com.thebrandonhoward.cupofjava.challenges.leetcode75.twopointers;

//13 | https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75
public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }

    public static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int sum = Math.min(height[leftIndex], height[rightIndex]) * rightIndex;

        while(leftIndex <= rightIndex) {
            if(height[leftIndex] <= height[rightIndex])
                leftIndex++;
            else
                rightIndex--;

            if(leftIndex < height.length && rightIndex >= 0)
                sum = Math.max(sum, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));
        }

        return sum;
    }
}