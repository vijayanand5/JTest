package com.learning.recursion;

/**
 * Created by vperiasamy on 2/19/17.
 */
public class RemoveAdjacentDupes {
    // hello
    static StringBuilder result = new StringBuilder();

    static char[] removeAdjDupes(char[] str, int len) {
        int k = 0, i = 1;
        while (i < len) {
            if (str[i - 1] != str[i]) {
                str[k++] = str[i - 1];
                i++;
            } else {
                i++;
            }
        }

        str[k++] = str[i-1];
        str[k] = '\0';

        if (k != len) {
            return removeAdjDupes(str, k);
        } else return str;
    }

    public static void main(String[] args) {
        char[] result = removeAdjDupes("geeksfgeeks".toCharArray(), "geeksfgeeks".length());
        int i = 0;
        while (result[i] != '\0') {
            System.out.print(result[i]);
            i++;
        }
    }
}
