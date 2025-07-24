package com.DsaPlaylist.BinarySearch.Questions;

public class CountOfRotation {
    public static void main(String[] args) {
//        int[] arr = {57,58,59,60,67,76,88,89,90,12,13,34,45,56};
        int[] arr = {4,5,6,7,0,1,2};

        //this is the program to calculate the no of the time the sorted array has been rotated
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                System.out.println("No of Rotation:"+ ++mid);
                System.exit(0);
            }else if (arr[start]<=arr[mid]){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
    }
}
