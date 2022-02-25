package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] square = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                square[row][cell] = (row + 1)  * (cell + 1);
            }
        }
        return square;
    }
}