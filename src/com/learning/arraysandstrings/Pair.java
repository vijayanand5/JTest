package com.learning.arraysandstrings;

/**
 * Created by vperiasamy on 2/19/17.
 */
class Pair {
    int row;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}