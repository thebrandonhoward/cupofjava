package com.thebrandonhoward.cupofjava.stacksandqueues;

import java.util.Map;

public class WellFormattedBrackets {

    private Map<Character,Character> bracketMap;

    public static void main(String... args) {

    }

    private WellFormattedBrackets() {
        setBracketMap();
    }
    private static WellFormattedBrackets getDefaultInstance() {
        return new WellFormattedBrackets();
    }

    private Map<Character,Character> getBracketMap() {
        return this.bracketMap;
    }

    private void setBracketMap() {
        bracketMap.put('}','{');
        bracketMap.put(']','[');
        bracketMap.put(')','(');
        bracketMap.put('>','<');
    }

//    private static boolean isWellFormatted(String input) {
//
//    }

}
