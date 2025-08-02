package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class LeetCode {
    static public void sortColors(int[] nums) {
        int a=0;int b=0;int c=0;int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }
            else if(nums[i]==1){
                b++;
            }
            else
                c++;}
        for(int i=0;i<a;i++){
            nums[d++]=0;}
        for(int i=0;i<b;i++){
            nums[d++]=1;}
        for(int i=0;i<c;i++){
            nums[d++]=2;}

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}
