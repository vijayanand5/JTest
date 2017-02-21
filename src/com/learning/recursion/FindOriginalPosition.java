package com.learning.recursion;

/**
 * Created by vperiasamy on 2/20/17.
 */
public class FindOriginalPosition {

    static int findOriginalPosition(int n, int result) {
        if (n == 1) return result;

        result = findOriginalPosition(n/2, result * 2);

        return result;
    }


    public static void main(String[] args) {
        System.out.println(findOriginalPosition("abcdefgh".length(), 1) - 1);
    }


}
