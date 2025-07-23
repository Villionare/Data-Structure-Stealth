package com.DsaPlaylist.BinarySearch.Questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

//old approach:
//1. finding the peak
//2. devide into increasing and decreasing and perform binary search
//3. if exists in any side return [index]
//4. else return -1;

//class Solution {
//    public int search(int[] nums, int target) {
//
//        if (nums.length == 1){
//            if (nums[0]==target){
//                return 0;
//            }else {
//                return -1;
//            }
//        } else {
//
//            int peak = peak(nums);
//
//            if (peak == 0){
//
//                int rightSearch = binarySearch(nums,target,peak+1,nums.length-1);
//                return rightSearch;
//
//            } else if (peak == nums.length-1) {
//
//                int leftSearch = binarySearch(nums,target,0, peak);
//                return leftSearch;
//
//            }else {
//
//            int leftSearch = binarySearch(nums,target,0, peak);
//
//            if (leftSearch != -1){
//                return leftSearch;
//
//            }else{
//
//                int rightSearch = binarySearch(nums,target,peak,nums.length-1);
//
//            if (rightSearch != -1){
//
//                    return rightSearch;
//
//                }else{
//
//                    return -1;
//                }
//            }
//
//            }
//
//        }
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//
//        if (arr.length == 2){
//            if (arr[0]==target){
//                return 0;
//            }else if (arr[1]==target){
//                return 1;
//            }else{
//                return -1;
//            }
//        }else {
//
//        if (arr[start] < arr[end]) {
//            // ascending
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    return mid;
//                }
//            }
//
//        } else if (arr[start] > arr[end]) {
//            // descending
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//
//                if (target < arr[mid]) {
//                    start = mid + 1;
//                } else if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    return mid;
//                }
//            }
//        }
//    }
//        // No immediate return here; let the loop do the search.
//        return -1;
//    }
//
//    static int peak(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            int midVal = arr[mid];
//            int nextVal = arr[mid + 1];
//
//            if (midVal < nextVal) {
//                start = mid + 1;
//            } else {
//                end = mid;
//            }
//        }
//        return start; // or end, both point to the peak
//    }
//}


//choosing a new approach:
//1. binary seach to find the pivoit(peak)
//    case 1: if mid > mid + 1 
//    case 2: if mid - 1  > mid
//    case 3: if end > mid -> end = mid - 1
//    case 4: if start < mid -> start = mid + 1
//2. now when we have found the pivot then we have 2 ascending sorted arrays
//3. do binary search on them one by one to check target

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
        int mid = start + (end-start)/2;

        if (target==nums[mid]){
            return mid;
        }

        if (nums[start]<=nums[mid]){
            if (nums[start]<=target && target<nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }else {
            if (target>nums[mid]&&target<=nums[end]){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        }
        return -1;
    }
}

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,7};
        int target = 7;

        Solution start = new Solution();

        System.out.println(start.search(arr, target));
    }
}
