package com.DsaPlaylist.Assignments;

public class LeetCode_867 {

    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix.length][];

//         for(int[] k:matrix){
//             for(int j:k){
//                 transposed[k][j] = 0;
//             }
//         }

         for(int i = 0; i<matrix.length; i++){
             for(int j = 0; j <matrix[i].length; j++ ){
                 transposed[j][i] = 0;
             }
         }

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++ ){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix = transpose(matrix1);

        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // new line after each row
        }

//        System.out.println(transpose(matrix1));
    }
}
