package com.DsaPlaylist.Assignments;

public class LeetCode_55 {

    public static boolean canJump(int[] nums) {
//            int numsLength =  nums.length-1;
//            int step = 0;
//
//            for (int i=0; i<=numsLength; i++){
//                //at any every considering these cases:
//                // it can be 0
//                        // OR [n+1]==0
//                // it can be number > 0
//                // it can be the no that >= numsLength
//                        // OR < numsLength but can be a helper
//
//
//                if (i<numsLength && nums[i]==0 && nums[i+1]==0){
//
//                    return false;
//
//                } else if (nums[i]>0) {
//
//                    if (nums[i]==1){
//
//                        step++;
//
//                    }else if(nums[i]==numsLength){
//                        return true;
//                    }
//
//                    for(int n=1; n<nums[i]; n++){
//                        if(nums[n]==0){
//                            continue;
//                        }else if (nums[n+1]==0&&nums[n+2]){
//                            continue;
//                        } else if (nums[n+1]) {
//
//                        }
//                    }
//                }
//
//            step++;
//            }
//
//            return step >= numsLength;

        //couldn't do it had to use leetcode solution
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,0,1,1};

        System.out.println(canJump(nums));
    }
}
