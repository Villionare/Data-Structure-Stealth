package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class BubbleSort {
    //bubble sort is also called sinking sort and exvchange sort
    //comparing the adjacent elements

    public static void main(String[] args) {
        int[] arr = {2,7,4,5,9,1};
        System.out.println(Arrays.toString(arr));

        int[] sortedArr = Bubble(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    static int[] Bubble(int[] arr){
        for (int i = arr.length-1; i >= 0; i--){

            for (int j = 0; j < i; j++){
                int temp = 0;

                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
