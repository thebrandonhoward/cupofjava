package com.thebrandonhoward.cupofjava.challenges;

//5 | https://leetcode.com/problems/reverse-words-in-a-string/submissions/1427805165/?envType=study-plan-v2&envId=leetcode-75
public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue"));
        System.out.println(reverse(" blue is sky the "));
        System.out.println(reverse(" "));
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        int rightIndex = s.length() - 1;

        while(rightIndex >= 0 && s.charAt(rightIndex) == ' ') {
            rightIndex--;
        }

        int leftIndex = rightIndex;

        for(int i=leftIndex; i>=0; i--) {
            while(leftIndex >= 0) {
                while(leftIndex >= 0 && s.charAt(leftIndex) != ' ') {
                    leftIndex--;
                }

                sb.append(s.substring(leftIndex + 1, rightIndex + 1)).append(' ');

                while(leftIndex >= 0 && s.charAt(leftIndex) == ' ') {
                    leftIndex--;
                }

                rightIndex = leftIndex;

                i = leftIndex;
            }
        }

        return sb.toString().trim();
    }
}
