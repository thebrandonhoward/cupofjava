package com.thebrandonhoward.cupofjava.challenges.leetcode75.arraystring;

//9 | https://leetcode.com/problems/string-compression/submissions/1432994978/?envType=study-plan-v2&envId=leetcode-75
public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(compress(new char[]{'a'}));
    }

    public static int compress(char[] chars) {
        int charCount;
        char previousChar;
        int currentIndex = 0;
        int charsIndex = 0;

        while(currentIndex < chars.length) {
            charCount = 0;
            previousChar = chars[currentIndex];

            while((currentIndex < chars.length) && (chars[currentIndex] == previousChar)) {
                charCount++;
                currentIndex++;
            }

            chars[charsIndex] = previousChar;

            if(charCount > 1) {
                for(char num : String.valueOf(charCount).toCharArray()) {
                    charsIndex++;
                    chars[charsIndex] = num;
                }
            }

            charsIndex++;
        }

        return charsIndex;
    }
}
