package com.thebrandonhoward.cupofjava.challenges;

import java.util.HashMap;
import java.util.Map;

public class MinChange {
    public static void main(String[] args) {
        System.out.println( minChange(4, new int[]{1,2,3}) );
        System.out.println( minChange(10, new int[]{1,2,3}) );
    }

    public static int minChange(int amount, int[] coins) {
        Map<Integer,Integer> memo = new HashMap<>();

        return minChange(amount, coins, memo);
    }

    public static int minChange(int amount, int[] coins, Map<Integer, Integer> memo) {
        if(memo.containsKey(amount))
            return memo.get(amount);

        if(amount == 0)
            return 0;

        if(amount < 0)
            return -1;

        int coinCount = -1;

        for(int coin : coins) {
            int amt = amount - coin;
            int resp = minChange(amt, coins);

            if(resp != -1) {
                int count = resp + 1;

                if(count < coinCount || coinCount == -1) {
                    coinCount = count;
                }
            }

        }

        memo.put(amount, coinCount);

        return coinCount;
    }

}
