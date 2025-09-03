package com.DsaPlaylist.Assignments;

public class SquareRoot {
    private static int SquareRoot(int n){
        int start = 1;
        int end = n;

        if(n==1){
            return 1;
        }

        while (start<=end){
            int middle = start + (end - start)/2;

            if(middle*middle>n){
                end = middle-1;
            } else if (middle*middle<n) {
                start = middle+1;
            }else{
                return middle;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SquareRoot(16));
    }
}
