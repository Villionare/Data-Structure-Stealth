package com.DsaPlaylist.BinarySearch.Questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array/


//1. finding the peak
//2. devide into increasing and decreasing and perform binary search
//3. if exists in any side return [index]
//4. else return -1;

class Solution {
    public int search(int[] nums, int target) {

        if (nums.length == 1){
            if (nums[0]==target){
                return 0;
            }else {
                return -1;
            }
        } else {

            int peak = peak(nums);

            if (peak == 0){

                int rightSearch = binarySearch(nums,target,peak+1,nums.length-1);

            } else if (peak == nums.length-1) {

                int leftSearch = binarySearch(nums,target,0, peak);

            }else {

            int leftSearch = binarySearch(nums,target,0, peak);

            if (leftSearch != -1){
                return leftSearch;

            }else{

                int rightSearch = binarySearch(nums,target,peak+1,nums.length-1);

            if (rightSearch != -1){

                    return rightSearch;

                }else{

                    return -1;
                }
            }

            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (arr.length == 2){
            if (arr[0]==target){
                return 0;
            }else if (arr[1]==target){
                return 1;
            }else{
                return -1;
            }
        }else {

        if (arr[start] < arr[end]) {
            // ascending
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        } else if (arr[start] > arr[end]) {
            // descending
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
    }
        // No immediate return here; let the loop do the search.
        return -1;
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int midVal = arr[mid];
            int nextVal = arr[mid + 1];

            if (midVal < nextVal) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // or end, both point to the peak
    }
}

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 0;

        Solution start = new Solution();

        System.out.println(start.search(arr, target));
    }
}
