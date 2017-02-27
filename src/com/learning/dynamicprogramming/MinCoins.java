package com.learning.dynamicprogramming;

/**
 * Created by vijayperiasamy on 2/27/17.
 */
public class MinCoins {

    // 3   {1, 2, 3}
    static int countMinCoinsForSum(int[] arr, int sum) {
        int[] min = new int[sum + 1];
        for (int i = 1 ; i < min.length; i++) {
            min[i] = Integer.MAX_VALUE;
        }

        min[0] = 0;
        int count = 0;
        //i = 2;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i - arr[j] >= 0) {
                    if (i - 1 + arr[j] <= i) {
                        count = min[i - 1] + 1;
                    } else {
                        count++;
                    }
                }
                min[i] = Math.min(count, min[i]);
                count = 0;
            }
        }
        return min[sum];
    }


    public static void main(String[] args) {
        System.out.println(countMinCoinsForSum(new int[]{1, 2, 5}, 5));
    }
}
