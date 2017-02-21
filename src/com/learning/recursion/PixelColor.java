package com.learning.recursion;

/**
 * Created by vperiasamy on 2/19/17.
 */
public class PixelColor {

    class Pixel {
        String color;
        int row;
        int col;
    }
    static void colorAdjacent(Pixel[][] pixArr, int row, int col, String oldColor, String newColor) {
        if (null == pixArr) return;

        if (row < 0 || row > pixArr.length - 1) return;
        if (col < 0 || col > pixArr[0].length - 1) return;
        if (pixArr[row][col].equals(oldColor)) {
            pixArr[row][col].color = newColor;
            colorAdjacent(pixArr, row + 1, col, oldColor, newColor);
            colorAdjacent(pixArr, row - 1, col, oldColor, newColor);
            colorAdjacent(pixArr, row, col - 1, oldColor, newColor);
            colorAdjacent(pixArr, row, col + 1, oldColor, newColor);
        }  else {
            return;
        }
    }
}
