package com.learning;

/**
 * Created by vperiasamy on 1/5/17.
 */
public class HasDuplicates {

    private static boolean hasDuplicateChars(String s) {
        if (null == s || s.isEmpty()) {
            return false;
        }

        boolean[] arr = new boolean[128];

        for (char c: s.toCharArray()) {
            if (arr[c]) {
                return true;
            } else {
                arr[c] = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicateChars("armas"));
    }
}
