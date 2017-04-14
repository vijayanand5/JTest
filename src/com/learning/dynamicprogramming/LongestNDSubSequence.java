package com.learning.dynamicprogramming;

/**
 * Created by vijayperiasamy on 3/11/17.
 */
public class LongestNDSubSequence {

    // -1 -5 -4 3 1 2
    static int lndSubSequence(int[] arr) {

        int[] dp = new int[arr.length];

        for (int i =0; i < arr.length; i++) {
            dp[i] = 1;
        }

        dp[0] = 1;

        return 0;
    }

    public static void main(String[] args) {

    }
}
