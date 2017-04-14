package com.learning.arraysandstrings;


public class SquareMatrix {


    static int[][] generateSquare(int val) {
        int  total = val * val, k = 1;
        int[][] arr = new int[val][val];


        int left = 0;
        int right = val - 1;
        int top = 0;
        int bottom = val - 1;

        while (k < total) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = k++;
            }
            top++;

            for (int l = top; l <= bottom; l++) {
                arr[l][right] = k++;
            }
            right--;

            if (top == bottom) break;
            for (int x = right; x >= left; x--) {
                arr[bottom][x] = k++;
            }
            bottom--;

            for (int y = bottom; y >= right; y--) {
                arr[y][left] = k++;
            }
            left++;

        }
        return arr;
    }

    public static void main(String[] args) {
        generateSquare(4);
    }
}