package com.thebrandonhoward.cupofjava.challenges;

//4 | https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {

    public static void main(String... args) {
        int[] z = {0,0,1,0,1};
        int[] x = {1,0,0,0,0,0,1};
        int[] y = {1,0,0,0,1};

        System.out.println(canPlaceFlowers(z, 1));
        System.out.println(canPlaceFlowers(x, 2));
        System.out.println(canPlaceFlowers(y, 1));
        System.out.println(canPlaceFlowers(y, 2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
            if(n == 0)
                return true;

            int previousIndex = 0;
            int nextIndex = 0;
            int amountPlanted = 0;
            int overflow = flowerbed.length;

            for(int currentIndex=0; currentIndex<flowerbed.length; currentIndex++) {
                nextIndex = currentIndex + 1;

                if(currentIndex == previousIndex) {
                    if(nextIndex < overflow) {
                        if(flowerbed[currentIndex] == 0 && flowerbed[nextIndex] == 0) {
                            flowerbed[currentIndex] = 1;
                            amountPlanted++;
                        }
                    }
                    else {
                        if(flowerbed[currentIndex] == 0 && n == 1) {
                            amountPlanted++;
                            return amountPlanted >= n;
                        }
                    }
                }
                else {
                    if(nextIndex < overflow) {
                        if((flowerbed[previousIndex] == 0) && (flowerbed[currentIndex] == 0) && flowerbed[nextIndex] == 0) {
                            flowerbed[currentIndex] = 1;
                            amountPlanted++;
                        }
                    }
                    else {
                        if((flowerbed[previousIndex] == 0) && (flowerbed[currentIndex] == 0)) {
                            flowerbed[currentIndex] = 1;
                            amountPlanted++;

                            return amountPlanted >= n;
                        }
                    }
                }

                previousIndex = currentIndex;
            }

            return amountPlanted >= n;
        }

}
