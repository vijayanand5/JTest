package com.learning.arraysandstrings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * Created by vijayperiasamy on 3/7/17.
 */
public class MergeIntervals {
    // { {1,3}, {2,4}, {5,7}, {6,8} }
    static void mergeIntervals(Interval[] arr) {
        if (null == arr || arr.length == 0) return;

        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        int i = 0;
        Stack<Interval> st = new Stack<>();
        st.add(arr[i++]);
        while (!st.isEmpty() && i < arr.length) {
            if (arr[i].start < st.peek().end) {
                st.peek().end = arr[i++].end;
            } else {
                st.push(arr[i++]);
            }
        }
        Interval t = null;
        while (!st.isEmpty()) {
            t = st.pop();
            System.out.println(t.start + ": " + t.end);
        }

    }

    public static void main(String[] args) {
        Interval i1 = new Interval(1,3);
        Interval i2 = new Interval(2,4);
        Interval i3 = new Interval(5,7);
        Interval i4 = new Interval(6,8);
        Interval[] arr = new Interval[] {i1, i2, i3, i4};

        mergeIntervals(arr);
    }
}
