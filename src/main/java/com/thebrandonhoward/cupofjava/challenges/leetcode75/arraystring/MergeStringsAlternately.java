package com.thebrandonhoward.cupofjava.challenges.leetcode75.arraystring;

//1 | https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc123","321cbaaaaa"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();

        int i = 0;

        while(i < Math.max(word1.length(), word2.length())) {
            if(i < word1.length())
                s.append(word1.charAt(i));

            if(i < word2.length())
                s.append(word2.charAt(i));

            i++;
        }

        return s.toString();
    }

}
