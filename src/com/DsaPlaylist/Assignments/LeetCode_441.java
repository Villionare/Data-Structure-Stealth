package com.DsaPlaylist.Assignments;

//https://leetcode.com/problems/arranging-coins/description/
public class LeetCode_441 {
    public static int arrangeCoins(int n) {
        int count = 0;

        for(int i=1; i<=n; i++){
//            n-=i;
//
//            if(n>=i){
//                count++;
//            }

            if (n>=i){
                count++;
                n-=i;
            }else {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
