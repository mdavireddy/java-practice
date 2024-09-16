package com.manu;

public class MaxPath {

    public static int findMaxArea(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        // boolean[][] visted = new boolean[rows][cols];

        int area = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    area = Math.max(area, findMaxPath(grid, i, j));
                }
            }
        }

        return area;
    }

    private static int findMaxPath(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = -1;
        return 1 + findMaxPath(grid, i, j + 1) +
                findMaxPath(grid, i + 1, j) +
                findMaxPath(grid, i - 1, j) +
                findMaxPath(grid, i, j - 1);
    }


    public static void main(String[] args) {

        int[][] grid = {{1, 0, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(findMaxArea(grid));

    }
}
