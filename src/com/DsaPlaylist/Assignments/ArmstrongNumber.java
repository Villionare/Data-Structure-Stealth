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

//most efficient solution:

// public class ArmstrongNumberEfficient {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Armstrong Checker: ");
//        long num = scanner.nextLong();
//        long temp = num;
//
//        // Count digits without Math.log10
//        int digits = 0;
//        long copy = num;
//        do {
//            digits++;
//            copy /= 10;
//        } while (copy > 0);
//
//        // Precompute powers for digits 0-9
//        long[] pow = new long[10];
//        for (int i = 0; i <= 9; i++) {
//            pow[i] = 1;
//            for (int j = 0; j < digits; j++) {
//                pow[i] *= i; // integer power
//            }
//        }
//
//        // Armstrong sum
//        long sum = 0;
//        while (num != 0) {
//            int remainder = (int) (num % 10);
//            sum += pow[remainder];
//            num /= 10;
//        }
//
//        if (sum == temp) {
//            System.out.println("It is an Armstrong number.");
//        } else {
//            System.out.println("It's not an Armstrong number.");
//        }
//    }
//}