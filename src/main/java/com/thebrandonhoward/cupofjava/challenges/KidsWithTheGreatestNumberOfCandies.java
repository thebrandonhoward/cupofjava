package com.thebrandonhoward.cupofjava.challenges;

import java.util.ArrayList;
import java.util.List;

//3 | https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1421079748/?envType=study-plan-v2&envId=leetcode-75
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
//        Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
//        Input: candies = [4,2,1,1,2], extraCandies = 1
//        Output: [true,false,false,false,false]
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
//        Input: candies = [12,1,12], extraCandies = 10
//        Output: [true,false,true]
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> outArray = new ArrayList<>();
        int max = 0;

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max)
                outArray.add(true);
            else
                outArray.add(false);
        }

        return outArray;
    }
}
