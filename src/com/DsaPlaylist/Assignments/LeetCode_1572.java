package com.DsaPlaylist.Assignments;

//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class LeetCode_1572 {

    public static int diagonalSum(int[][] mat) {
        int start = 0;
        int end = mat[0].length-1;
        int sum = 0;

        for(int i=0; i<mat.length; i++){

            if(start == end){
                sum += mat[i][start];
                start++;
                end--;
                continue;
            }

            sum += mat[i][start];
            sum += mat[i][end];
            start++;
            end--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(arr));
    }
}
