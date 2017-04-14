package com.learning.arraysandstrings;

/**
 * Created by vijayperiasamy on 3/25/17.
 */
public class CountIslands {

    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {0, -1}, {1, -1}, {-1, 1}};

    public static int countIslands(int[][] mat) {
        if (mat == null || mat.length == 0) return -1;
        int count = 0;
        boolean[][] arr = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && !arr[i][j]) {
                    count ++;
                    dfsUtil(mat, mat[i][j], arr, i, j);
                }
            }
        }
        return count;
    }

    private static void dfsUtil(int[][] mat, int prev, boolean[][] arr, int x, int y) {

        if (x < 0 || y < 0 || x > mat.length - 1 || y > mat[0].length - 1 || arr[x][y]) return;

        if (mat[x][y] == prev) {
            arr[x][y] = true;

            for (int[] v : d) {
                if (x + v[0] < 0 || y + v[1] < 0 || x + v[0] > mat.length - 1 || y + v[1] > mat[0].length - 1 || arr[x][y]) {
                    dfsUtil(mat, mat[x][y], arr, x + v[0], y + v[1]);
                }
            }
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        int mat[][] =  {{1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 1}};
        System.out.println(countIslands(mat));
    }
}
