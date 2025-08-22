package com.DsaPlaylist.Assignments;

public class LeetCode_26 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }

        }
        return ++j;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
