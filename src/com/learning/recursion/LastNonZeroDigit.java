package com.learning.recursion;

import java.math.BigInteger;

/**
 * Created by vperiasamy on 2/19/17.
 */
public class LastNonZeroDigit {
    //5! -> 5*4*3*2*1 -> 120
    static int fact(int n) {
        if(n == 1) return 1;

        return n * fact(n -1);

    }

    public static void main(String[] args) {
        int n = 5;
        int result = 0;
        int rem = n % 10;
        if ((n/10) % 2 != 0) {
            result = 4 * fact((int)Math.floor(n/5)) * fact(rem);
        } else {
            result = 6 * fact((int)Math.floor(n/5)) * fact(rem);
        }
        System.out.println(result);
    }
}
