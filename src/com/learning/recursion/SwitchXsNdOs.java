package com.learning.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vperiasamy on 2/20/17.
 */
public class SwitchXsNdOs {

    static boolean isOsSurroundedWithX(char[][] mat, int row, int col) {

        if (row - 1 < 0 || row + 1 < mat.length || col - 1 < 0 || col + 1 > mat[0].length) return false;
        boolean result = true;
        if (mat[row][col] == 'O') {
            result &= isOsSurroundedWithX(mat, row + 1, col);
            result &= isOsSurroundedWithX(mat, row - 1, col);
            result &= isOsSurroundedWithX(mat, row, col + 1);
            result &= isOsSurroundedWithX(mat, row, col - 1);
        }

        return result;
    }

    static void fillMatrix(char[][] mat) {
        if ( null == mat) return;
        Map<Pair, Boolean> visited = new HashMap<Pair, Boolean>(mat.length * mat[0].length);

        for (int i = 0; i < mat.length; i++) {
            for ( int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 'O') {
                    isOsSurroundedWithX(mat, i , j);
                }
            }
        }
    }


    // [5, 2, 4, 1]
    // [1, 1, 1, 0, 1]


}
