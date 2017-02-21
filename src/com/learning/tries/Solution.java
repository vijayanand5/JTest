package com.learning.tries;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



class Solution {


    class TrieNode {
        TrieNode[] arr;
        boolean isEnd;
        int wordsEndCount;

        public TrieNode() {
            this.arr = new TrieNode[26];
            this.isEnd = false;
            this.wordsEndCount = 0;
        }
    }

    class Trie {
        TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode t = root;
            for (char c : word.toCharArray()) {
                int val = c - 'a';
                if (t.arr[val] == null) {
                    TrieNode node = new TrieNode();
                    t.arr[val] = node;
                    t = node;
                    t.wordsEndCount += 1;
                } else {
                    t = t.arr[val];
                    t.wordsEndCount += 1;
                }
            }
        }

        public int findPartialCount(String partial) {
            TrieNode t = root;
            for (char c: partial.toCharArray()) {
                int val = c - 'a';
                if (t.arr[val] != null) {
                    t = t.arr[val];
                } else {
                    return 0;
                }
            }
            return t.wordsEndCount;
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        Solution.Trie trie = new Solution().new Trie();
//        for(int a0 = 0; a0 < n; a0++){
//            String op = in.next();
//            String contact = in.next();
//            if (op.equals("add")) {
//                trie.addWord(contact);
//            } else {
//                System.out.println(trie.findPartialCount(contact));
//            }
//
//        }

        trie.addWord("jel");
        trie.addWord("jello");
        System.out.println(trie.findPartialCount("jel"));
    }
}
