package com.DsaPlaylist.Assignments;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class LeetCode_1929 {
    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2*(nums.length)];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

//    faster one 0 ms
//    class Solution {
//        public int[] getConcatenation(int[] nums) {
//            int n=nums.length;
//            int[] res=new int[n*2];
//            System.arraycopy(nums,0,res,0,n);
//            System.arraycopy(nums,0,res,n,n);
//            return res;
//        }
//    }

}

