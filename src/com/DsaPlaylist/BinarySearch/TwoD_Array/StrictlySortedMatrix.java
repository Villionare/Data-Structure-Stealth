package com.DsaPlaylist.BinarySearch.TwoD_Array;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] nums = {
            {101,102,103,104,105},
            {106,107,108,109,110},
            {111,112,113,114,115},
            {116,117,118,119,120},
            {121,122,123,124,125}
        };
        //this method uses applying binary search over start to the end element.
        int row = nums.length;
        int columns = nums[0].length;

        int start = 0;
        int end = (row*columns)-1;
        int target = 122;

        while(start<=end){
            int mid = start + (end - start)/2;

            int rowF = mid/columns;
            int colsF = mid%columns;

            if(nums[rowF][colsF]==target){
                System.out.println(rowF + " " + colsF);
                return;
            }

            if (nums[rowF][colsF]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    }
}
