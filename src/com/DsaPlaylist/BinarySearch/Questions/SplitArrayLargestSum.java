package com.DsaPlaylist.BinarySearch.Questions;


//https://leetcode.com/problems/split-array-largest-sum/
class Solution {
    public int splitArray(int[] nums, int k) {

//        int start = 0;
//        int end = nums.length -1;
//
//        int mid = start + (end - start)/k;
//
//        int sumOne = 0;
//        int sumTwo = 0;
//
//        for(int i=start; i<=mid; i++){
//            sumOne += nums[i];
//        }
//
//        for(int i=mid; i<=nums.length-1; i++){
//            sumTwo += nums[i];
//        }
//
//        if (sumOne > sumTwo){
//            return sumTwo;
//        }else {
//            return sumOne;
//        }

        return 0;
    }
}

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        Solution sol = new Solution();
        int ans = sol.splitArray(nums, k);
        System.out.println(ans);
    }
}
