package com.DsaPlaylist.BinarySearch.TwoD_Array;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {1,  5,  8,  12, 15, 20},
                {2,  6,  9,  13, 16, 21},
                {3,  7,  10, 14, 17, 22},
                {4,  11, 18, 23, 25, 28},
                {19, 24, 26, 29, 30, 31},
                {32, 33, 34, 35, 36, 37}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    //binary search to find an element in 2D Array
    static int[] search(int[][] arr, int target){
        int row = 0;
        int coloum = arr.length-1;
        System.out.println(coloum);

        while (row<arr.length && coloum >= 0){
            if (arr[row][coloum]==target){
                return new int[]{row,coloum};
            }

            if (arr[row][coloum]<target){
                row++;
            }else{
                coloum--;
            }
        }
        return new int[]{-1,-1};
    }
}