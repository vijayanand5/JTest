package com.learning.arraysandstrings;

/**
 * Created by vijayperiasamy on 3/3/17.
 */
public class HammingDistance {


    public static void main(String[] args) {
        int x = 1, y = 16;
        int res = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((res & 1) != 0)
                count++;
            res >>= 1;
        }

        System.out.println(count);
    }




}
