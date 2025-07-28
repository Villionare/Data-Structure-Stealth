package com.DsaPlaylist.BinarySearch.TwoD_Array;

public class RowColMatrix_MyMethod {
    public static void main(String[] args) {
        int[][] arr ={
                        {1, 5, 8, 12, 15, 20},
                        {2, 6, 9, 13, 16, 21},
                        {3, 7, 10, 14, 17, 22},
                        {4, 11, 18, 23, 25, 28},
                        {19, 24, 26, 29, 30, 31},
                        {32, 33, 34, 35, 36, 37}
        };

        int target = 37;
        int[] foundI = searchBinary2D(arr,target);

        if (foundI[0]== -1){
            System.out.println("not found");
        }else{
            System.out.println("found at: " + "arr[" + foundI[0] + "]" + "[" + foundI[1] + "]");
        }
    }

    public static int[] searchBinary2D(int[][] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int[] temp = {-1,-1};

        while(start<=end){
            int last = arr[start].length-1;

            if (target > arr[start][last]){
                start++;

            }else{

                int begin = 0;
                int fall = arr[start].length-1;

                while (begin<=fall){
                    int mid = begin + (fall-begin)/2;
                    if(arr[start][mid]>target){
                        fall = mid-1;
                    } else if (arr[start][mid]<target) {
                        begin = mid +1;
                    } else if (arr[start][mid] == target) {
                        temp[0] = start;
                        temp[1] = mid;
                        return temp;
                    }
                }
            }
        }
        return temp;
    }
}
