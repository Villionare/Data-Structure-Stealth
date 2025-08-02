package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class SelectionSort {
//this algo has them time complexity of O(n square)

    //--select an element and put it into its correct index.

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {

                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
            System.out.println(Arrays.toString(arr));
    }

        public static void main(String[] args) {
            //ascending order sort
            int[] arr =  {34,67,340,934,765,23,78,893,4,78,312,7698,1};

            selectionSort(arr);


        }



//        private static void assSort(int[] arr){
//            for (int i = 0; i< arr.length; i++){
//                int temp = 0;
//                for (int j = i + 1; j < arr.length; j++){
//                    if (arr[j] <= arr[i]){
//                        temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//
//    private static void DessSort(int[] arr){
//        for (int i = 0; i< arr.length; i++){
//            int temp = 0;
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[j] >= arr[i]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        }
//
//    public static void sort(int[] arr) {
//        int n = arr.length;
//
//        // One by one, move the boundary of the unsorted subarray
//        for (int i = 0; i < n - 1; i++) {
//            // Find the minimum element in the remaining unsorted array
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            // Swap the found minimum element with the first element of the unsorted subarray
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
}

