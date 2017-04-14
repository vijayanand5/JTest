package com.learning.arraysandstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vijayperiasamy on 3/12/17.
 */
public class Subsets {
    // [1, 2] - 4
    // Using combinatorics

    static void printCombinations(String[] arr) {
        List<ArrayList<String>> superSet = new ArrayList<>();
        int l = arr.length;

        int t = (int)Math.pow(2, l) - 1;

        for (int i = t; i >= 0; i--) {
            if (i == 0) {
                superSet.add(new ArrayList<String>());
            }
            ArrayList<String> subset = new ArrayList<>();
            // 1 1 1 1
            // 1 1 1 0
            // 1 1 0 1
            // 1 1 0 0
            for (int k = i, times = 0; times < l; k >>= 1, times += 1 ) {
                if ((k & 1) == 1) {
                    subset.add(arr[times]);
                }
            }
            superSet.add(subset);
        }

        for (List<String> e : superSet) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        printCombinations(new String[]{ "a", "b", "c", "d"});
    }

}
