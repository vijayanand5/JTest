package com.learning.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vperiasamy on 2/17/17.
 */
public class ArrayMultiply {

    static boolean isPermutation(String a, String b) {
        if (null == a || null == b || a.isEmpty() || b.isEmpty()) {
            return false;
        }
        // assumption: String can contain Unicode characters & might contain duplicates
        // assumption: if no duplicates, we can use a boolean array

        Map<Character, Integer> valMap = new HashMap<>();
        for (char c: a.toCharArray()) {
            valMap.put(c, (valMap.get(c) == null)? 1 : valMap.get(c) + 1);
        }
        for (char v: b.toCharArray()) {
            if (null == valMap.get(v) || valMap.get(v) <= 0) {
                return false;
            }
            valMap.put(v, valMap.get(v) - 1);
        }
        for (char c: a.toCharArray()) {
            if (valMap.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("abcd#%", "#%*bcad"));
    }
}
