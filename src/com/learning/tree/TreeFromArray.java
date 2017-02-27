package com.learning.tree;

/**
 * Created by vijayperiasamy on 2/22/17.
 */
public class TreeFromArray {

    // [2, 4, 6, 8, 10]
    //      6
    //

    // [2, 4, 6, 8, 10, 12, 14, 18]


    /*
    root = n/2


     */

    static Node constructTreeFromArray(int[] arr, int start, int end) {

        if (null == arr) return null;

        Node root = new Node();

        int mid = (start + end) / 2;

        root.data = arr[mid];

        root.left = constructTreeFromArray(arr, start, mid - 1);

        root.right = constructTreeFromArray(arr, mid + 1, end);

        return root;
    }



}
