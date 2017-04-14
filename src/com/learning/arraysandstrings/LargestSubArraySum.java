package com.learning.arraysandstrings;

import java.io.*;
import java.util.*;
import java.net.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class LargestSubArraySum {
    public static void main(String[] args) throws IOException {
        String url = ("http://www.textfiles.com/etext/FICTION/wells-war-189.txt");
        List<String> top10 = findTop10Words(url, 10);
        for (String word : top10) {
            System.out.println(word);
        }
    }

    /**
     * the : 4588
     * then : 4588
     * a : 3000
     * ...
     */
    public static List<String> findTop10Words(String url, int k) throws IOException {

        List<String> result = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
        Map<String, Integer> valMap = new HashMap<>();
        String line = null;
        String[] arr = null;
        while ((line = in.readLine()) != null) {
            arr = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            for (String val: arr) {
                valMap.put(val, (valMap.get(val) == null)? 1 : valMap.get(val) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(valMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        });

        int i = 0;
        for (Map.Entry<String, Integer> e : list) {
            if (i == k) {
                break;
            }
            result.add(e.getKey());
            i++;
        }

        return result;
    }


}
