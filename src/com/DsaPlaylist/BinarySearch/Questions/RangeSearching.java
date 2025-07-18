//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.DsaPlaylist.BinarySearch.Questions;

import java.util.Arrays;

public class RangeSearching {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] pos = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);


        return pos;
    }

    static int search(int nums[], int target, boolean searchFirst){

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
