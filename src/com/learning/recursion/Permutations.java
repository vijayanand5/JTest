package com.learning.recursion;

/**
 * Created by vperiasamy on 2/18/17.
 */
public class Permutations {
    // abc -> bc  a ->
    static void printPermutations(String str, String prefix) {
        if (null == str) return;
        //System.out.println("val: " + str);
        if (str.equals("")) System.out.println(prefix);

        for (int i = 0; i < str.length(); i++) {
            printPermutations(str.substring(0, i) + " " + str.substring(i), prefix + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        printPermutations("abc", "");


    }
}
