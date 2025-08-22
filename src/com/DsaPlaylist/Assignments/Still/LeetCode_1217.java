package com.DsaPlaylist.Assignments.Still;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
public class LeetCode_1217 {

    public static void main(String[] args) {

        int[] position = {1,2,3};
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<position.length; i++){
            if (position[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(Math.min(oddCount, evenCount));
    }
}
