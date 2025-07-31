package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class BubbleSort {
    //bubble sort is also called sinking sort and exvchange sort
    //comparing the adjacent elements

    public static void main(String[] args) {
        int[] arr = {2,7,4,5,9,1};

        for (int i = arr.length-1; i >= 0; i--){

            for (int j = 0; j < i; j++){
                int temp = 0;

                if (arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
