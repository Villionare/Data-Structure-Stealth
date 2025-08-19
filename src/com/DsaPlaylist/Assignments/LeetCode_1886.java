package com.DsaPlaylist.Assignments;

import java.util.Arrays;

public class LeetCode_1886 {
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] transposed = new int[n][n];

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = transposed[i][start];
                transposed[i][start] = transposed[i][end];
                transposed[i][end] = temp;
                start++;
                end--;
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat, target)); // true
    }
}
