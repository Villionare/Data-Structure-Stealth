package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class Practise {

    //bubbleSort
    static void bubbleSort(int[] nums){
        int length = nums.length-1;
        boolean swapped;
        for(int i=length; i>=0; i--){
            //comparing i wiith j+1 even after replacing;
            swapped = true;
            for(int j = i-1; j>=0;j--){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int nums[]){
        int length = nums.length;

    }

    public static void main(String[] args) {
        int[] nums = {5,7,1,3,4,2,6,8};
        bubbleSort(nums);
    }
}
