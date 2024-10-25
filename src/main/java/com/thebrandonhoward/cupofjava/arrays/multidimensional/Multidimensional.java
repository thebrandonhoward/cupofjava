package com.thebrandonhoward.cupofjava.arrays.multidimensional;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] mdArray1 = new int[2][2];
        int[][] mdArray2 = {{1,2},{3,4}};
        int[][] mdArray3 = { {1, 2, 3},
                             {4, 5, 6, 9},
                             {7},
                             {}, };

        //1,2,3,4
        System.out.println(mdArray2[0][0]);
        System.out.println(mdArray2[0][1]);
        System.out.println(mdArray2[1][0]);
        System.out.println(mdArray2[1][1]);

        System.out.println();

        // calculate the length of each row
        System.out.println("Length         : " + mdArray3.length);
        System.out.println("Length of row 1: " + mdArray3[0].length);
        System.out.println("Length of row 2: " + mdArray3[1].length);
        System.out.println("Length of row 3: " + mdArray3[2].length);
        System.out.println("Length of row 4: " + mdArray3[3].length);
        //1,2,3,4,5,6,9,7
        System.out.println(mdArray3[0][0]);
        System.out.println(mdArray3[0][1]);
        System.out.println(mdArray3[0][2]);
        System.out.println(mdArray3[1][0]);
        System.out.println(mdArray3[1][1]);
        System.out.println(mdArray3[1][2]);
        System.out.println(mdArray3[1][3]);
        System.out.println(mdArray3[2][0]);
    }
}
