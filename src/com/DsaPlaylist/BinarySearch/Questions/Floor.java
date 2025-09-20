package com.DsaPlaylist.BinarySearch.Questions;

public class Floor {
    public static void main(String[] args){
        //floor of target is the greatest number smaller than equals to target (<= target)

        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;

        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target){
//    var first = new int[44];
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        //if the target is the smallest number in the array then there is no floor so return -1
        if (target <= arr[0]){
            return -1;
        }
        while (start<=end){
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];




    }
}
