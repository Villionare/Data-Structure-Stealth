package com.DsaPlaylist.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 12, 11, 9, 13, 8, 5, 6, 10 };

        System.out.println(Arrays.toString(insertionSort(nums)));

    }

    static int[] insertionSort(int[] nums){
        int length = nums.length-1;

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i]; // 2. This is the element we want to insert into the sorted part.
            int j = i - 1;    // 3. This is the last index of the already sorted part.

            /* 4. Move elements of nums[0..i-1] that are greater than the key
                  to one position to their right. This makes space for the key. */
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j]; // Shift the larger element to the right.
                j = j - 1;           // Move left to check the next element.
            }
            // 5. Place the key in the correct spot (just after the element
            //    that is smaller than it).
            nums[j + 1] = key;
        }

//        for(int i=1; i<=length;i++){
//
//            if (nums[i]<nums[i-1]){
//                for (int s=i; s>=0; s--){
//
//                    if (nums[s]<=nums[i]){
//
//                        int toShiftLeft = nums[i];
//                        int toSwap = s + 1;
//
//                        for (int k = i; k>=toSwap; k--){
//                            if(k==nums.length-1){
//                                continue;
//                            }
//                            nums[k+1] = nums[k];
//                        }
//
//                        nums[s] = toShiftLeft;
//                    }
//                }
//
//            }
//        }


    return nums;
    }
}
