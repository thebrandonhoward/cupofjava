package com.thebrandonhoward.cupofjava.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("sbackss", "saksbcs"));
    }

    public static boolean isPermutation(String key, String val) {
        if(Objects.isNull(key) || Objects.isNull(val))
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : key.toCharArray()) {
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        for(int i = 0; i < val.length(); i++) {
            if(!map.containsKey(val.charAt(i)))
                return false;

            int count = map.get(val.charAt(i)) - 1;

            if(count < 0)
                return false;

            map.put(val.charAt(i), count);
        }

        for(Integer v : map.values())
        {
            if(v != 0) return false;
        }

        return true;
    }

}