package com.learning.arraysandstrings;

/**
 * Created by vijayperiasamy on 3/17/17.
 */

public class MatrixCount {

    public static void main(String[] args) {
        int[][] v = new int[][]{{1, 1, 1},
                {2, 1, 6},
                {3, 4, 5}};
        System.out.println(getMaxConsecutiveCount(v));
    }


    static int getMaxConsecutiveCount(int[][] mat) {
        if (null == mat || mat.length == 0) return -1;
        int maxCount = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int currCount = dfsUtil(mat, i, j, mat[i][j]);
                maxCount = Math.max(currCount, maxCount);
            }
        }
        return maxCount;
    }

    static int dfsUtil(int[][] m, int x, int y, int v) {

        if (x < 0 || x > m.length - 1 || y < 0 || y > m[0].length - 1 || m[x][y] != v) {
            return 0;
        }
        if (m[x][y] == Integer.MIN_VALUE) return 0;

        m[x][y] = Integer.MIN_VALUE;
        return 1 + dfsUtil(m, x + 1, y, v) + dfsUtil(m, x - 1, y, v) + dfsUtil(m, x, y + 1, v) + dfsUtil(m, x, y - 1, v);

    }
}