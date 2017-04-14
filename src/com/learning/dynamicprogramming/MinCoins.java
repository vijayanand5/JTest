package com.learning.dynamicprogramming;

/**
 * Created by vijayperiasamy on 2/27/17.
 */
public class MinCoins {


    static int countMinCoinsImplementedForSum(int[] arr, int sum) {
        int[] min = new int[sum + 1];
        for (int i = 1 ; i < min.length; i++) {
            min[i] = Integer.MAX_VALUE;
        }

        min[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i && (min[i-arr[j]] + 1) < min[i]) {
                    min[i] = min[i-arr[j]] + 1;
                }
            }
        }
        return min[sum];
    }


    public static void main(String[] args) {
        System.out.println(countMinCoinsImplementedForSum(new int[]{1, 2, 3}, 5));
    }
}
