package com.DsaPlaylist.BinarySearch.Questions;

//given an infinite sorted array and finding out the index of some element

//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
//since we have infinite we do not have bounds to perform binary search
//so we won't consider length property of the array(we will solve it w/o using length)

public class InfiniteArray_FindingTheIndex {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10,90,10,130,140,160,170};
        int target = 10;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target){
        int start = 0;
        int end = 1;

        while (target > nums[end]){
        //new end = previous end + 2* previous box size
            int newStart = end +1;
            int newEnd = end + 2*(end - start + 1);

            start = newStart;
            end = newEnd;

        }

        return binarySearch(nums, start,end,target);
    }

    static int binarySearch(int[] arr,int start,int end, int target){
        //so now we need to find the middle index

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        //if not found
        return -1;
    }
}
