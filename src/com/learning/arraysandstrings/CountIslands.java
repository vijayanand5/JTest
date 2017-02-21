package com.learning.arraysandstrings;

import java.util.*;

/**
 * Created by vperiasamy on 2/19/17.
 */
public class CountIslands {
    /*
        0  1  0  1  0
        0  0  1  1  1
        1  0  0  1  0
        0  1  1  0  0
        1  0  1  0  1
     */
    static Queue<Pair> islandQueue = new LinkedList<Pair>();

    static int countIslands(int[][] mat) {
        int count = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col ++) {
                if (mat[row][col] ==  1) {
                    markIslands(mat, row, col);
                    count++;
                }
            }
        }
        return count;
    }


    static void markIslands(int[][] mat, int row, int col) {
            islandQueue.clear();
            islandQueue.add(new Pair(row, col));
            Pair temp = null;
            while (!islandQueue.isEmpty()) {
                temp = islandQueue.remove();
                row = temp.getRow();
                col = temp.getCol();
                if (mat[row][col] == 1) {
                    mat[row][col] = 2;

                    pushAdjacentLand(mat, temp.getRow() + 1, temp.getCol(), islandQueue);
                    pushAdjacentLand(mat, temp.getRow() - 1, temp.getCol(), islandQueue);
                    pushAdjacentLand(mat, temp.getRow(), temp.getCol() + 1, islandQueue);
                    pushAdjacentLand(mat, temp.getRow(), temp.getCol() - 1, islandQueue);

                }
            }


    }

    private static void pushAdjacentLand(int[][] mat, int row, int col, Queue<Pair> islandQueue) {
        if (row >= 0 && row < mat.length && col >= 0 && col < mat[0].length) {
            islandQueue.add(new Pair(row, col));
        }

    }

    public static void main(String[] args) {
        int[][] mat = new int[5][6];

        mat[0][0] = 0;
        mat[0][1] = 1;
        mat[0][2] = 0;
        mat[0][3] = 1;
        mat[0][4] = 0;

        mat[1][0] = 0;
        mat[1][1] = 0;
        mat[1][2] = 1;
        mat[1][3] = 1;
        mat[1][4] = 1;

        mat[2][0] = 1;
        mat[2][1] = 0;
        mat[2][2] = 0;
        mat[2][3] = 1;
        mat[2][4] = 0;

        mat[3][0] = 0;
        mat[3][1] = 1;
        mat[3][2] = 1;
        mat[3][3] = 0;
        mat[3][4] = 0;

        mat[4][0] = 1;
        mat[4][1] = 0;
        mat[4][2] = 1;
        mat[4][3] = 0;
        mat[4][4] = 1;

        System.out.println(countIslands(mat));

    }

}
