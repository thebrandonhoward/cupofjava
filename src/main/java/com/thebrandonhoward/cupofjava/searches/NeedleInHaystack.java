package com.thebrandonhoward.cupofjava.searches;

import java.util.Objects;

public class NeedleInHaystack {
    public static void main(String... args) {
        System.out.println("Is needle in haysneedletack? " + NeedleInHaystack.find("haysneedletack","needle"));
        System.out.println("Is needle in needlehaystack? " + NeedleInHaystack.find("needlehaystack","needle"));
        System.out.println("Is needle in haystackneedle? " + NeedleInHaystack.find("haystackneedle","needle"));
        System.out.println("Is needle in haystaneedlck?  " + NeedleInHaystack.find("haystaneedlck","needle"));
        System.out.println("Is needle in haystack?       " + NeedleInHaystack.find("haystack","needle"));
    }

    public static boolean find(String stringToSearch, String stringToFind) {
        //Validate
        if((stringToSearch.length() < stringToFind.length()) || stringToSearch.isBlank() || stringToFind.isBlank())
            return false;

        //Set starting positions
        int leftIndex = 0;
        int rightIndex = stringToFind.length();
        int indexOutOfBounds = stringToSearch.length();

        //Check is current substring is equal to string to find
        while(rightIndex <= indexOutOfBounds) {
            //Move pointers and loop until stringtosearch index oob
            if(stringToSearch.substring(leftIndex, rightIndex).equals(stringToFind))
                return true;

            leftIndex++;
            rightIndex++;
        }

        return false;
    }
}
