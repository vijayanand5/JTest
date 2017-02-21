package com.learning.recursion;

/**
 * Created by vperiasamy on 2/18/17.
 */
public class CountMatrixPaths {


    public static int countPaths(int[][] mat, int row, int col) {
        if (row == mat.length - 1 && col == mat[0].length - 1) return 1;

        if (row >= mat.length || col >= mat[0].length) return 0;

        return countPaths(mat, row, col + 1) + countPaths(mat, row + 1, col);


    }

    public static void main(String[] args) {
        System.out.println(countPaths(new int[2][8], 0, 0));
    }
}
