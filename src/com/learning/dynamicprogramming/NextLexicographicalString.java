package com.learning.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 hefg
 dhck
 dkhc


 hegf
 dhkc
 hcdk



 */
public class NextLexicographicalString
{


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        char[] arr = word.toCharArray();
        int len = arr.length;
        int j = len - 1, i = len - 2;

        while (arr[i] > arr[j]) {
            j--;
            i--;
        }
        int temp = i + 1;
        while (temp < len) {
            if (arr[temp] < arr[i] && arr[temp] < arr[j]) {
                j = temp;
            }
        }

        //swap
        char tempC = arr[j];
        arr[j] = arr[i];
        arr[i] = tempC;

        i++;

        Arrays.sort(arr, i, len - 1);

    }
}
