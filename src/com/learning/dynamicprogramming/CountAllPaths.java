package com.learning.dynamicprogramming;

/**
 * Created by vijayperiasamy on 3/7/17.
 */
public class CountAllPaths {

    public int countRec(int[][] mat, int x, int y, int x1, int y1) {
        if (x == x1 && y == y1) return 1;

        if (x > mat.length || y > mat[0].length) return -1;

        return countRec(mat, x + 1, y, x1, y1) + countRec(mat, x, y + 1, x1, y1);
    }

}
