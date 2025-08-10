package com.DsaPlaylist.Assignments;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class LeetCode_1480 {

        static int sum(int i, int[] nums){
            int s = 0;
            for(int j = 0; j<=i; j++){
                s += nums[j];
            }
            return s;
        }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            runningSum[i] = sum(i,nums);
        }

        return runningSum;
    }

    public static void main(String[] args) {
            int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
