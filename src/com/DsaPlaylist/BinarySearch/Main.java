package com.DsaPlaylist.BinarySearch;

public class Main {
    public static void main(String[] args) {
        //binary search is applied on sorted arrays, then we devide the array in two part comprising of
        //a middle element, which is used for comparison.
        //best case complexity will be O(1), as the element can be the in the middle of the sorted array
        //worst case will be log(n), where n is the no of elements in the array

        int[] arr = {1,2,3,4,5,6,7,8,9,10,34,44,54,64,74,84,94,100};

        //to search = 94
        int target = 94;

        int length = (arr.length-1)/2;
//        System.out.println(length);

        if (target> arr[length]){
            //right side

        } else if (target<arr[length]) {
            //left side
        }
    }
}
