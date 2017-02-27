package com.learning.tree;

/**
 * Created by vijayperiasamy on 2/22/17.
 */
public class CheckBalancedTree {

    static int getHeight(Node root) {
        if (null == root) return 0;

        int left = getHeight(root.left);

        int right = getHeight(root.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;

    }
}
