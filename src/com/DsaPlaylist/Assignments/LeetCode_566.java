package com.DsaPlaylist.Assignments;

import java.util.Arrays;

public class LeetCode_566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c) return mat;
        int[][] ans=new int[r][c];
        int k=0,l=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[k][l++]=mat[i][j];
                if(l==c){
                    k++;
                    l=0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};

        System.out.println(Arrays.toString(matrixReshape(mat,1, 4)));
    }
}
