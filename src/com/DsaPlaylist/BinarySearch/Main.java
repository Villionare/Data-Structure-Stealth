package com.DsaPlaylist.BinarySearch;

public class Main {
    public static void main(String[] args) {
        //binary search is applied on sorted arrays, then we devide the array in two part comprising of
        //a middle element, which is used for comparison.
        //best case complexity will be O(1), as the element can be the in the middle of the sorted array
        //worst case will be log(n), where n is the no of elements in the array

        int[] arr = {1,2,3,4,5,6,7,8,9,10,34,44,54,64,74,84,94,100};

        int result = binarySearch(arr, 100);
        if (result >= 0){
            System.out.printf("The element is found at index %d", result);
        } else {
            System.out.println("element is not found");
        }
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //so now we need to find the middle index

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        //if not found
        return -1;
    }
}
