//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.DsaPlaylist.BinarySearch.Questions;


import java.util.Arrays;

public class RangeSearching {

    public static void main(String[] args) {
        int[] temp = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(temp,8)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] temp = {-1,-1};

        temp[0] = searchIndex(nums, target, true);

        if (temp[0] != -1){
            temp[1] = searchIndex(nums, target, false);
        }

        return temp;
    }

    static int searchIndex(int[] nums, int target, boolean searchLeft){

        int potentialAns = -1;

        int start = 0;
        int end = nums.length -1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (target>nums[mid]){
                start = mid + 1;
            } else if (target<nums[mid]) {
                end = mid - 1;
            }else {
                potentialAns = mid;

                if (searchLeft){
                    //if we find the first occurrence if the target then apply binary search again
                    end = mid-1;
//                    return end;
                }else{
                    start = mid+1;
//                    return start;
                }
            }
        }

        return potentialAns;
    }
}
