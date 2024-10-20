package com.thebrandonhoward.cupofjava.challenges.leetcode75.arraystring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//5 | https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowelsOfAString {
    public static void main(String... args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aAeEiIoOuU"));
    }

    public static String reverseVowels(String s) {
        final Set<Character> vowelSet = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        char[] swappedArray = s.toCharArray();
        char temp = ' ';

        while(leftIndex < rightIndex) {
            while(leftIndex < rightIndex && !vowelSet.contains(s.charAt(leftIndex))) {
                leftIndex++;
            }

            while(rightIndex > leftIndex && !vowelSet.contains(s.charAt(rightIndex))) {
                rightIndex--;
            }

            temp = s.charAt(leftIndex);
            swappedArray[leftIndex] = s.charAt(rightIndex);
            swappedArray[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        return String.valueOf(swappedArray);
    }
}
