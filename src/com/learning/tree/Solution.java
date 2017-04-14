package com.learning.tree;

import java.util.*;

public class Solution {
    Map<Integer, Integer> valMap = new HashMap<>();

    public int[] findFrequentTreeSum(Node root) {
        calculateSubTreeSum(root);
        LinkedList<Map.Entry<Integer, Integer>> tmpList = new LinkedList<>(valMap.entrySet());
        Collections.sort(tmpList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a,
                               Map.Entry<Integer, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });
        int[] val = new int[tmpList.size()];
        int prev = tmpList.get(0).getValue();
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : tmpList) {
            if (entry.getValue() == prev) {
                val[i++] = entry.getKey();
            }
        }

        return val;
    }


    int calculateSubTreeSum(Node root) {
        if (root == null) {
            return 0;
        }
        int result = calculateSubTreeSum(root.left) + calculateSubTreeSum(root.right) + root.data;
        valMap.put(result, valMap.get(result) == null? 1 : valMap.get(result) + 1);
        return result;
    }
}