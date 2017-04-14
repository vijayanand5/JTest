package com.learning.arraysandstrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vijayperiasamy on 3/6/17.
 */
public class FindLongestPalindromicSubsequence {

    List<String> result = new ArrayList<>();
    private static String canReach(int x1, int y1, int x2, int y2){
        Map<String, Boolean> memoiz = new HashMap<>();
        if(helper(x1, y1, x2, y2, memoiz)){
            return "Yes";
        }else{
            return "No";
        }
    }

    private static boolean helper(int x1, int y1, int x2, int y2, Map<String, Boolean> memoiz) {
        String mapString = x1+"_"+y1+"_"+x2+"_"+y2;
        if(memoiz.containsKey(mapString)) {
            return memoiz.get(mapString);
        }
        if (x1 == x2 && y1 == y2) {
            return true;
        }
        if(x1>x2 || y1 > y2){
            return false;
        }
        boolean result = helper(x1, x1+y1, x2, y2, memoiz) || helper(x1+y1, y1, x2, y2, memoiz);
        memoiz.put(mapString,result);
        return result;
    }

    public static void main(String[] args) {

    }
}
