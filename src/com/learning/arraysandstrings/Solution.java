package com.learning.arraysandstrings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        if (T < 1 || T > 10) return;
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            if (n < 0 || n > 1000) return;
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }


            // 2 1 5 3 4
            // 2 5 1 3 4
            int count = 0;
            boolean flag = false;
            for (int i = 1; i < q.length; i++) {
                if (q[i-1] - i > 2) {
                    flag = true;
                    break;
                } else if (q[i-1] - q[i] > 0) {
                    count += q[i-1] - q[i];
                }
            }
            if (flag) {
                System.out.println("Too chaotic");
            } else {
                System.out.println(count);

            }
        }
    }
}
