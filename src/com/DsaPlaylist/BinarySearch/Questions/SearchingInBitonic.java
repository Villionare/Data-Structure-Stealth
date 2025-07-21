package com.DsaPlaylist.BinarySearch.Questions;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchingInBitonic {

    static int staticLeft;
    static int staticRight;

    public static void main(String[] args) {
    int[] arr = {1,5,2};

        System.out.println("Search Final: " + search(arr,2));
    }

    static int search(int[] arr, int target){
        //searching for the peak in bitonic array
        int peak = peak(arr);
        System.out.println("peak: "+peak);
        if (peak==-1){
            System.out.println("problem in the bitonic array");
        }else {

            staticLeft = binarySearch(arr, target, 0, peak);
            System.out.println("static left: " + staticLeft);

            if(staticLeft==-1){

                staticRight = binarySearch(arr, target, peak + 1, arr.length-1);
                System.out.println("static Right: " + staticRight);

                return staticRight;

            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (arr[start] < arr[end]) {
            // ascending
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        } else if (arr[start] > arr[end]) {
            // descending
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

        }
        // No immediate return here; let the loop do the search.
        return -1;
    }

//    static int binarySearch(int[] arr, int target, int start, int end){
//
//        if (arr[start] < arr[end]) {
//            //ascending order
//
//            while (start <= end) {
//
//                int mid = start + (end - start) / 2;
//
//                if (target < arr[mid]) {
//
//                    end = mid - 1;
//
//                } else if (target > arr[mid]) {
//
//                    start = mid + 1;
//
//                } else if (target == arr[mid]) {
//                    return mid;
//                }
//            }
//
//        } else if (arr[start] > arr[end]) {
//            //descending order
//
//            while (start <= end) {
//
//                int mid = start + (end - start) / 2;
//
//                if (target < arr[mid]) {
//
//                    start = mid + 1;
//
//                } else if (target > arr[mid]) {
//
//                    end = mid - 1;
//
//                } else if (target == arr[mid]) {
//                    return mid;
//                }
//
//            }
//
//        }
//        //if not found
//        return -1;
//    }

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
