package com.learning.arraysandstrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by vijayperiasamy on 3/4/17.
 */
public class Test {
    public static void main(String[] args) {
        //System.out.println(numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1,2);
        System.out.println(mp.get(0));
    }

    static int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i=2; i<A.length; i++)
            if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
                curr += 1;
                sum += curr;
            } else {
                curr = 0;
            }
        return sum;
    }
}
