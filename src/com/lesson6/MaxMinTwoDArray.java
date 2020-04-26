package com.lesson6;

public class MaxMinTwoDArray {

    public static void main(String[] args) {
        int[][] matrix2D = {
                {1, 4, 6, 8, 7, 9, 4, 55},
                {4, 6, 7, 8, 6, 96, 22, 67},
                {5, 7, 9, 0, 11, 85, 77, 87},
                {43, 43, 6, 7, 99, 21, 4343, 43},
                {-59, 46576, 11, 56, 7, 12, 76, 686}
        };

        int[][] result = getMaxMinMatrix(matrix2D);

        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMaxMinMatrix(int[][] matrix) {
        int rowQuantity = matrix.length;
        int[][] result = new int[rowQuantity][2];

        for (int i = 0; i < rowQuantity; i++) {
            int[] row = matrix[i];
            result[i] = new int[]{min(row), max(row)};
        }
        return result;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }


}
