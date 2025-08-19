package com.DsaPlaylist.Assignments;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> output = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];  // add digit from array + carry (stored in k)
                i--;
            }
            output.addFirst(k % 10);  // store last digit
            k /= 10;                  // update carry + remaining k
        }
        return output;
    }

    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;

        System.out.println(addToArrayForm(num,k));
    }
}
