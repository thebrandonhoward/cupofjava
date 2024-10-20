package com.thebrandonhoward.cupofjava.challenges.leetcode75.arraystring;

//2 | https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
public class GreatestCommonDivisorOfStrings {
    public static void main(String... args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));

        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));

        str1 = "LEET";
        str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length())
            return gcdOfStrings(str2, str1);

        if(str1.equals(str2))
            return str1;

        if(str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()), str2);

        return "";
    }
}
