package com.DsaPlaylist.Assignments;

//1. 3-digit example
//153 → 3 digits, so power = 3
//cube of all 3 digits, then add -> =1+125+27=153✅

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armstrong Checker:");
        long num = scanner.nextLong();
        long temp = num;
        long add = 0;
        long digits = (num==0)? 1 : ((int) Math.log10(num) + 1);

        while (num!=0){
            long remainder = num%10;
            add += (long) Math.pow(remainder, digits);
            num /= 10;
        }

        if (add == temp){
            System.out.println("it is.");
        }else {
            System.out.println("it's not.");
        }
    }
}
