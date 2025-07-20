package com.DsaPlaylist.BinarySearch.Questions;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchingInBitonic {

    static int staticLeft;
    static int staticRight;

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,1};

    int found = search(arr,3);
    System.out.println(staticLeft);
    }

    static int search(int[] arr, int target){
        //searching for the peak in bitonic array
        int peak = peak(arr);

        if (peak==-1){
            System.out.println("problem in the bitonic array");
        }else {

            staticLeft = binarySearch(arr, target, 0, peak);

            staticRight = binarySearch(arr, target, peak + 1, arr.length-1);

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

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

    static int peak(int[] arr){
        //so now we need to find the middle index
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            int after = mid;
            int before = mid;

            after++;
            before--;

            if(before < 0 ){
                before++;
            }

            if(after > arr.length - 1){
                after--;
            }

            if (arr[mid]>=arr[before] && arr[mid]<=arr[after]){
                //ascending case
                start = mid+1;

            } else if (arr[mid]<=arr[before] && arr[mid]>=arr[after]) {
                //descending case
                end = mid-1;
            } else if (arr[mid]>=arr[before] && arr[mid]>=arr[after]){
                //peak case
                return mid;
            }
        }
        //if not found
        return -1;
    }
}
