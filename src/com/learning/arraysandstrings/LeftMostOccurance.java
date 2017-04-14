package com.learning.arraysandstrings;

/**
 * Created by vijayperiasamy on 3/7/17.
 */
public class LeftMostOccurance {

    // 0 2 2 2 2 3 3


    static int findLeftMostOccurrence(int[] arr, int n) {
        if (null == arr || arr.length == 0) return -1;

        int h = arr.length - 1;
        int l = 0;
        int result = 0;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (n == arr[mid]) {
                int i = mid;
                while (n == arr[i] && i >= 0) {
                    i--;
                }
                return i + 1;
            }

            if (n < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(findLeftMostOccurrence(new int[]{0,2,2,2,2,3,3}, 3));
    }
}
