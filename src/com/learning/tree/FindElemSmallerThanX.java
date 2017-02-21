package com.learning.tree;

/**
 * Created by vperiasamy on 2/19/17.
 */
public class FindElemSmallerThanX {

    static Node findLargestElemSmallerThanX(Node root, int x) {
        Node result = null;

        while (null != root) {
            if (x > root.data) {
                result = root;
                root = root.right;
            } else {
                root = root.left;
            }
        }


        return result;
    }


    public static void main(String[] args) {

    }
}
