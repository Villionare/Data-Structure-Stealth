package com.DsaPlaylist.Assignments.Still;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        //selecting an element
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(check(matrix,i,j)){
                    list.addFirst(matrix[i][j]);
                }else{
                    continue;
                }
            }
        }

        return list;
    }

    //check row and coloum
    public boolean check(int[][] mat, int r, int c){
        int min = mat[r][c]; //for row
        int max = mat[r][c]; //for coloum

        //row check
        for(int i=0; i<mat[r].length; i++){
            if(mat[r][i]<=min){
                min = mat[r][i];
            }
        }

        if(min == mat[r][c]){

            //coloum check
            for(int i=0; i<mat.length; i++){
                if(mat[i][c]>=max){
                    max = mat[i][c];
                }
            }

            if(max == mat[r][c]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCode_1380 obj = new LeetCode_1380();

        int[][] arr = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        System.out.println(obj.luckyNumbers(arr));
    }
}
