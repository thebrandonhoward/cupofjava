package com.thebrandonhoward.cupofjava.challenges.leetcode75.twopointers;

//12 | https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int shortCount = 0;
        int longCount = 0;

        while(longCount < t.length() && shortCount < s.length()) {
            if(s.charAt(shortCount) == t.charAt(longCount))
                shortCount++;

            longCount++;
        }

        return shortCount == s.length();
    }
}
