package com.learning.arraysandstrings;

/**
 * Created by vijayperiasamy on 3/18/17.
 */
public class SortedRotatedSearch {

    public static int findPivotLocation(int arr[]) {
        int l = 0, h = arr.length - 1;
        int val = -1;
        while (l <= h) {
            int mid = l + (h - l)/2;
            if (arr[mid] > arr[mid + 1]) {
                val = mid;
                break;
            } else if (arr[mid] < arr[l] && arr[mid] < arr[mid + 1]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return val;
    }

    public static int searchRotatedArray(int[] arr, int v) {
        if (null == arr || arr.length == 0) return -1;

        int pivot = findPivotLocation(arr);
        int result = -1;
        if (pivot == -1) {
            //normal array
            result = binarySearch(arr, v, 0, arr.length - 1);
        }

        if (arr[pivot] == v) {
            return pivot;
        } else if (v >= arr[0]){
            result = binarySearch(arr, v, 0, pivot - 1);
        } else {
            result = binarySearch(arr, v, pivot + 1, arr.length - 1);
        }

        return result;
    }

    static int binarySearch(int[] arr, int v, int l, int h) {
        int val = -1;
        while (l <= h) {
            int mid = l + (h - l)/2;
            if (arr[mid] == v) {
                val = mid;
                break;
            } else if (v < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(searchRotatedArray(new int[]{1, 3, 4, 5, 6, 7, 0}, 5));
    }
}
