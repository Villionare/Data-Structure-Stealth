package com.DsaPlaylist.Assignments;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LeetCode_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> output= new ArrayList<>();
//        int no = 0;
        BigInteger bigNo = BigInteger.ZERO;


        for(int i:num){
            bigNo = bigNo.multiply(BigInteger.TEN)
                    .add(BigInteger.valueOf(i));
        }

        System.out.println();

        bigNo = bigNo.add(BigInteger.valueOf(k));

//        while(no>0){
//            long s = no%10;
//            output.addFirst((int)s);
//            no = no/10;
//        }

        while (bigNo.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divRem = bigNo.divideAndRemainder(BigInteger.TEN);
            // divRem[0] = quotient, divRem[1] = remainder

            int digit = divRem[1].intValue(); // remainder is the last digit
            output.addFirst(digit);

            bigNo = divRem[0]; // update to quotient
        }


        return output;
    }

    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;

        System.out.println(addToArrayForm(num,k));
    }
}
