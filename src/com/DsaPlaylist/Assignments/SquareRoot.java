package com.DsaPlaylist.Assignments;

public class SquareRoot {
    private static boolean SquareRoot(long num){
        long start = 1;
        long end = num;

        while(start<=end){
            long middle = start+(end-start)/2;

            if(middle*middle>num){
                end = middle-1;
            } else if (middle*middle<num) {
                start = middle+1;
            }else{
                return (middle*middle==num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(SquareRoot(2147483647));
    }
}
