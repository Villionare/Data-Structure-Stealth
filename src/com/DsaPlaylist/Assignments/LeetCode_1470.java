package com.DsaPlaylist.Assignments;

//https://leetcode.com/problems/shuffle-the-array/description/
import java.util.Arrays;

public class LeetCode_1470 {

    public static int[] shuffle(int[] nums, int n) {
        int[] ordered = new int[nums.length];

        int count = 0;
        for(int i = 0; i<n; i++){
            ordered[count] = nums[i];
            count += 2;
        }

        int cunt = 1;
        for(int i = n; i<nums.length; i++){
            ordered[cunt] = nums[i];
            cunt += 2;
        }

        return ordered;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}