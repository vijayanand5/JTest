package com.learning.heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by vperiasamy on 2/13/17.
 */
public class Solution {
    // 1 2 3 4 5 6 7 8 9 10

    // 10 9 8 7 6 5 4 3 2 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        float median = Integer.MIN_VALUE;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(1, Collections.reverseOrder());
        for(int a_i=1; a_i <= n; a_i++){
            a[a_i-1] = in.nextInt();
            if (a[a_i-1] > median) {
                minHeap.add(a[a_i-1]); //  1
            } else {
                maxHeap.add(a[a_i-1]); //
            }

            if (minHeap.size() == 0 && a_i == 1) {
                median = maxHeap.peek();
                System.out.println(median);
                continue;
            } else if (maxHeap.size() == 0 && a_i == 1){
                median = minHeap.peek();
                System.out.println(median);
                continue;
            }

            if (a_i % 2 == 0) {
                if (minHeap.size() > maxHeap.size()) {
                    maxHeap.add(minHeap.poll());
                    median = (float)(minHeap.peek() + maxHeap.peek())/2;
                } else if (maxHeap.size() > minHeap.size()) {
                    minHeap.add(maxHeap.poll());
                    median = (float)(minHeap.peek() + maxHeap.peek())/2;
                } else {
                    median = (float)(minHeap.peek() + maxHeap.peek())/2;
                }
            } else {
                if (minHeap.size() > maxHeap.size()) {
                    median = minHeap.peek();
                } else {
                    median = maxHeap.peek();
                }
            }


            System.out.println(median);
        }
    }
}

