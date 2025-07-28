package com.DsaPlaylist.BinarySearch.Questions;


//https://leetcode.com/problems/split-array-largest-sum/
//class Solution {
//    int splitArray(int[] nums,int k){
//        //        int start = 0;
////        int end = nums.length -1;
////
////        int mid = start + (end - start)/k;
////
////        int sumOne = 0;
////        int sumTwo = 0;
////
////        for(int i=start; i<=mid; i++){
////            sumOne += nums[i];
////        }
////
////        for(int i=mid; i<=nums.length-1; i++){
////            sumTwo += nums[i];
////        }
////
////        if (sumOne > sumTwo){
////            return sumTwo;
////        }else {
////            return sumOne;
////        }
//
//
//    }
//}

class Solution {
    public int checkSum(int num, int nums[]) {
        int count = 1;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum+nums[i] > num) {
                count++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            sum += nums[i];
        }

        int low = max; //minimum value
        int high = sum; //maximum value
        int ans = high;

        if (k == 1)
            return high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = checkSum(mid, nums);
            if (count <= k) {
                // ans = Math.min(ans, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

public class SplitArrayLargestSum {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        Solution sol = new Solution();
        int ans = sol.splitArray(nums, k);
    }
