package com.DsaPlaylist.BinarySearch.TwoD_Array;

public class Temp {
    public static void main(String[] args) {
//        int[][] nums = {
//                            {1,  5,  8,  12, 15, 20},
//                            {2,  6,  9,  13, 16, 21},
//                            {3,  7,  10, 14, 17, 22},
//                            {4,  11, 18, 23, 25, 28},
//                            {19, 24, 26, 29, 30, 31},
//                            {32, 33, 34, 35, 36, 37},
//                            {33, 34, 35, 36, 37, 38}
//                        };

//        we will start by by setting the upper and lower bonds
//        lower bond will be (0,0)
//        upper bond will be (0,length-1)

//        so the cases will be:
//        case1: element == target
//        case2: element > target -> ignore the coloum--
//        case3: element < target -> ignore the row++

//        int target = 29;
//
//        //so we have to use binary search for this
//        int row = 0;
//        int coloum = nums[0].length - 1;
//        ;
//
//        while(row<nums.length && coloum >= 0){
//
//            if (nums[row][coloum]==target){
//                System.out.println(row + " " + coloum);
//                return;
//            }
//
//            if (nums[row][coloum]<target){
//                row++;
//            } else if (nums[row][coloum]>target) {
//                coloum--;
//            }
//        }

//        int[][] nums = {
//                            {1,  5,  8,  12, 15, 20},
//                            {2,  6,  9,  13, 16, 21},
//                            {3,  7,  10, 14, 17, 22},
//                            {4,  11, 18, 23, 25, 28},
//                            {19, 24, 26, 29, 30, 31},
//                            {32, 33, 34, 35, 36, 37},
//                            {33, 34, 35, 36, 37, 38}
//                        };

    //strictly sorted 2d array

    int[][] nums = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
    };

    int target = 20;

    int row = 0;
//    int coloum = nums.length-2;
    int coloum = nums.length-1;

    while(row<nums.length && coloum >= 0){
        if (nums[row][coloum]==target){
            System.out.println("Found: " + row + " "+ coloum);
            return;
        }

        if (nums[row][coloum]>target){
            coloum--;
        }else{
            row++;
        }
    }
    }
}