package com.thebrandonhoward.cupofjava.searches;

public class NeedleInHaystack {
    public static void main(String... args) {
        System.out.println("Is needle in haysneedletack? " + NeedleInHaystack.find("haysneedletack","needle"));
        System.out.println("Is needle in needlehaystack? " + NeedleInHaystack.find("needlehaystack","needle"));
        System.out.println("Is needle in haystackneedle? " + NeedleInHaystack.find("haystackneedle","needle"));
        System.out.println("Is needle in haystaneedlck? " + NeedleInHaystack.find("haystaneedlck","needle"));
        System.out.println("Is needle in haystack? " + NeedleInHaystack.find("haystack","needle"));
    }
    public static boolean find(String stringToSearch, String stringToFind) {
        if(stringToFind.isBlank() || (stringToFind.length() > stringToSearch.length()))
            return false;

        int headPointer = 0;
        int tailPointer = stringToFind.length() - 1;

        while (!stringToSearch.substring(headPointer, tailPointer + 1).equals(stringToFind)) {
            headPointer++;
            tailPointer++;

            if(tailPointer == stringToSearch.length())
                return false;
        }


        return true;
    }
}
