package com.learning.recursion;

/**
 * Created by vperiasamy on 2/18/17.
 */
public class CountSubSets {
    // {1, 2, 3} - [0,1,2,3,3,4,5]
    // {1, 2, 3, 4}
    //[1,2] [1,3] [2,3]
    // Input : arr[] = {2, 3}
    // Output: 0 2 3 5
    static void getSubArrayCounts(int[] arr, int l , int r, int sum) {
        System.out.println("l:" + l + " r:" + r + " sum:" + sum);
        if (null == arr) return;

        if (l > r)
        {
            System.out.println(sum + " ");
            return;
        }

        // Subset including arr[l]
        getSubArrayCounts(arr, l+1, r, sum+arr[l]);

        // Subset excluding arr[l]
        getSubArrayCounts(arr, l+1, r, sum);
    }


    public static void main(String[] args) {
        getSubArrayCounts(new int[]{5,4,3}, 0, 2, 0);
    }
}
