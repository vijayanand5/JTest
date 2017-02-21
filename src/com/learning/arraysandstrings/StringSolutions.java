package com.learning.arraysandstrings;

/**
 * Created by vperiasamy on 2/5/17.
 */
public class StringSolutions {
    public static boolean checkUniqueString(String value) {
        if (null == value || value.isEmpty()) {
            return false;
        }

        boolean[] charArray = new boolean[256];

        for (char c : value.toCharArray()) {
            if (charArray[c]) {
                return false;
            } else {
                charArray[c] = true;
            }
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        if (null == str1 || null == str2) return false;

        if (str1.length() != str2.length()) return false;

        int[] count = new int[256];

        for (char c : str1.toCharArray()) {
            count[c]++;
        }

        for (char c : str2.toCharArray()) {
            if (count[c] == 0) {
                return false;
            }
            count[c]--;
        }

        for(int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }


    // a ab   // ab ac // a ab //
    public static boolean isOneEditAway(String str1, String str2) {
        if (null == str1 || null == str2) return false;

        if (str1.isEmpty() && str2.isEmpty()) return true;

        if (Math.abs(str1.length() - str2.length()) > 2) return false;

        int index1 = 0;
        int index2 = 0;
        String s1 = null;
        String s2 = null;

        if (str1.length() < str2.length()) {
            s1 = str1;
            s2 = str2;
        } else {
            s1 = str2;
            s2 = str1;
        }

        while (index1 < s1.length() && index2 < s2.length()) {
            boolean foundDiff = false;
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (s1.length() + 1 == s2.length()) {
                    if (foundDiff) {
                        return false;
                    }
                    foundDiff = true;
                    index2++;
                } else {
                    if (foundDiff) {
                        return false;
                    }
                    foundDiff = true;
                }
            } else {
                index2++;
                index1++;
            }
        }
        return true;
    }

    //1  2  3  4
    //5  6  7  8
    //9  10 11 12
    //13 14 15 16
    public static int[][] rotateMatrix(int[][] arr) {
        if (null == arr || arr.length == 0) return arr;

        if (arr.length != arr[0].length) return arr;

        int n = arr.length;
        int i = 0, j = 0;
        for (i = 0; i < n/2; i++) {
            for (j = n-1; j >= 0 + i; j--, n = (n/2) + 1) {
                int temp = arr[i][j - 1];
                arr[i][j] = arr[i][i];
                arr[i][i] = arr[j][i];
                arr[j][i] = arr[j][j];
                arr[j][j] = temp;
            }

        }
        return arr;
    }

    private static int checkReplace(String str1, String str2) {
        return 1;
    }

    public static void main(String[] args) {
        StringSolutions stringSolutions = new StringSolutions();
        System.out.println("Prob1:" + stringSolutions.checkUniqueString("abcdef;/@#/"));

        System.out.println("Prob 2: " + stringSolutions.isPermutation("bac", "abc"));
    }
}


// abc