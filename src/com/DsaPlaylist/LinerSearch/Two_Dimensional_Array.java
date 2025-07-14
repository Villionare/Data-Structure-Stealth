package com.DsaPlaylist.LinerSearch;

import java.util.Arrays;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5,6},
                {45,23,6,534,35,345},
                {3,7},
                {87,45,34,23,6,524,6},
                {45,54,34,5465,5,34,65},
                {456,46,5,3234,45,54},
        };

        //searching in 2d array
        //search for the element 3234

        for (int[] item:arr){
            for (int i: item){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j]==3234){
                    System.out.printf("found element at index: a[%d][%d]",i,j);
                }
            }
        }

        System.out.println(" ");

        int max = arr[0][0];
        //searching for the largest element in the array
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("so the largest number in the 2d array is: " + max);
    }
}
