package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 12, 11, 13, 5, 6 };

        System.out.println(Arrays.toString(insertionSort(nums)));

    }

    static void insertionSort(int[] nums){
        int length = nums.length;

        for(int i=0; i<length;i++){
            for(int j = i+1;j<length;j++){
                if(nums[j]<nums[i]){
                    
                }
            }
        }
    }
}
