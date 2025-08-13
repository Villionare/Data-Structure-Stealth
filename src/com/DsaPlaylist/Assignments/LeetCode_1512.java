package com.DsaPlaylist.Assignments;

public class LeetCode_1512 {

        public static int numIdenticalPairs(int[] nums) {
            int[] count = new int[101];
            int pairs = 0;

            for (int num : nums) {
                System.out.println(count[num]);
                pairs += count[num];
                count[num]++;
            }
            return pairs;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println("pairs: " + numIdenticalPairs(nums));
    }
}
