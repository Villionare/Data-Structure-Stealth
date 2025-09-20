package com.DsaPlaylist.BinarySearch.Questions;

public class Ceiling {
    public static void main(String[] args) {
        //ceiling = smallest element greater or = target
        //ceil of target is >= target

//        STEPS FOR CALCULATING CEILING OF A NUMBER
//        1. CHECK IF THE TARGET NUMBER EXITS IN THE ARRAY, IS YES THEN THAT'S THE ANSWER
//        2. IF NOT IN ARRAY THEN - FIND ALL THE ELEMENTS GREATER THAN THE TARGET
//        3. AMONG ALL THE GREATER NUMBER RETURN THE SMALLEST NUMBER

        int[] arr = {2,3,5,9,14,16,18};

        int target = 4;

        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        //if the target is greater than the last number of the array than:
        if (target > arr[arr.length-1]){
            return -1;
        }
//* AT THE END OF THE WHILE LOOP (if target is not in the array) start = mid(end) + 1;
//  which violets the condition of while loop (start<=end)
        while (start<=end){
            mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]){
                start = mid +1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];

    }
}