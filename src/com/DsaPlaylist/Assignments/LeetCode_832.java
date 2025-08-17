package com.DsaPlaylist.Assignments;

import java.util.Arrays;

public class LeetCode_832 {

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] finall = new int[image.length][image[0].length];

        int reverse[] = new int[image[0].length];

        for(int i = 0; i<image.length;i++){
                int k = image[i].length-1;

            for (int j = 0; j<image[i].length;j++){
                int no = image[i][j];

                finall[i][k] = no;
                k--;

            }
        }

        for (int i = 0; i<finall.length;i++){
            for (int j = 0;j<finall[i].length;j++){

                if (finall[i][j]==0){
                    finall[i][j] = 1;
                }else {
                    finall[i][j] = 0;
                }
            }
        }

        return finall;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] print = flipAndInvertImage(arr);

        for (int i = 0; i<print.length;i++){
            for (int j = 0;j<print[i].length;j++){
                System.out.print(print[i][j]);
            }
            System.out.println(" ");
        }
//        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
}
