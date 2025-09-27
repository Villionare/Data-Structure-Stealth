package com.DsaPlaylist.Recursion;

public class RecursionBinarySearch {
    static void main() {
        int[] arr = {2,3,5,7,8,34,98,100};

        System.out.println(Binary(0, arr.length-1, 8, arr));
    }
    
    static int Binary(int start, int end, int target, int[] arr){
        int n = (start + end)/2;
        
        if (arr[n] == target){
            return n;
        } else if (arr[n]<target) {
            return Binary(start, n - 1, target, arr);
        } else if (arr[n]>target) {
            return Binary(n + 1, end, target, arr);
        }

        return -1;
    }
}
