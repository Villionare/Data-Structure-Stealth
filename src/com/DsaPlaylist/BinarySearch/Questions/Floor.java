package com.DsaPlaylist.BinarySearch.Questions;

public class Floor {
    public static void main(String[] args){
        //floor of target is <= target

        int[] arr = {2,3,5,9,14,16,18};

        int target = 10;

        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start<=end){
            mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]){
                start = mid +1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }
}
