package com.DsaPlaylist.BinarySearch.Questions;


//a mountain array is also called: A bitonic array
public class MountainArray {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,7,9,10,14,18,20,18,17,16,11,5,1};
//        int[] arr = {0,10,5,2};
        int[] arr = {3,5,3,2,0};

        //mid = peak
        //mid < peek

        //mid can't be greater than peak

//        int chota = 0;
//        int bada = 1;
//
//        while (arr[bada] >= arr[chota]){
//            bada++;
//            chota++;
//        }
//
//        System.out.println(arr[chota]);

        //this above is a linear search type algo using while loop its complexity is O(n), which is not good
        //binary search will be better so will be trying that


        System.out.println(binarySearch(arr));

    }

    static int binarySearch(int[] arr){
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