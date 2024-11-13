package com.thebrandonhoward.cupofjava.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
max path sum
Write a method, maxPathSum, that takes in a grid as an argument.
The method should return the maximum sum possible by traveling a path from the top-left corner to the bottom-right corner.
You may only travel through the grid by moving down or right.
You can assume that all numbers are non-negative.
 */
public class MaxPathSum {
    public static void main(String[] args) {
        List<List<Integer>> grid = List.of(
                List.of(1, 3, 12),
                List.of(5, 1, 1),
                List.of(3, 6, 1)
        );
        System.out.println( maxPathSum(grid) ); // -> 18

        grid = List.of(
                List.of(1, 1, 3, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 2, 1, 1, 6, 1, 1, 5, 1, 1, 0, 0, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 5, 1, 1, 1, 1, 0, 1, 1, 1, 1),
                List.of(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(2, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1),
                List.of(2, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 42, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        );
        System.out.println( maxPathSum(grid) ); // -> 82

    }

    public static int maxPathSum(List<List<Integer>> grid) {
        return  maxPathSum(0, 0, grid, new HashMap<>());
    }

    public static int maxPathSum(int rowIndex, int columnIndex, List<List<Integer>> grid, Map<List<Integer>,Integer> memo) {
        if(rowIndex > grid.size() - 1 || columnIndex > grid.get(0).size() - 1) {
            return 0;
        }

        if(rowIndex == grid.size() - 1 && columnIndex == grid.get(grid.size() - 1).size()) {
            return grid.get(rowIndex).get(columnIndex);
        }

        List l = List.of(rowIndex, columnIndex);

        if(memo.containsKey(l))
            return memo.get(l);

        int sum = grid.get(rowIndex).get(columnIndex) + Math.max(maxPathSum(rowIndex + 1, columnIndex, grid, memo)
                , maxPathSum(rowIndex, columnIndex + 1, grid, memo));

        memo.put(l, sum);

        return sum;
    }
}
