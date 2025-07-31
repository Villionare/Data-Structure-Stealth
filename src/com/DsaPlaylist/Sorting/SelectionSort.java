package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class SelectionSort {
//this algo has them time complexity of O(n square)

        public static void main(String[] args) {
            //ascending order sort
            int[] arr =  {34,67,340,934,765,23,78,893,4,78,312,7698,1};

            arr = sort(arr);

            System.out.println(Arrays.toString(arr));
        }
        private static int[] sort(int[] arr){

            for (int i = 0; i< arr.length; i++){
                int temp = 0;
                for (int j = i + 1; j < arr.length; j++){
                    if (arr[j] <= arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }
    }

