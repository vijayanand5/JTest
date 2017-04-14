package com.learning.dynamicprogramming;

/**
 * Created by vijayperiasamy on 2/28/17.
 */
public class EditDistance {

    static int findEditDistance(String str1, String str2) {
        if (null == str1 || null == str2) return -1;

//        if (str1.isEmpty()) {
//            return str2.length();
//        } else if (str2.isEmpty()) {
//            return str1.length();
//        }


        int m = str1.length();
        int n = str2.length();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0) {
                    arr[i][j] = j;
                }else if (j == 0) {
                    arr[i][j] = i;
                } else if (str1.charAt(i) == str2.charAt(j)) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1 + arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
                }
            }
        }

        return arr[m - 1][n - 1];
    }

    public static void main(String[] args) {

    }
}
