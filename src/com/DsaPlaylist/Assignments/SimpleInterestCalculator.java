package com.DsaPlaylist.Assignments;

//Simple Interest (SI) is the extra money you pay or earn when you borrow or lend money,
// calculated only on the original amount (principal) for the whole time period.

//Formula: (P * R * T)/100

//Where:
//P = Principal (the original amount of money)
//R = Rate of interest (per year, in %)
//T = Time (in years)

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Interest Calculator:\nEnter the Amount");
        long amt = scanner.nextLong();
        System.out.println("Rate of Interest(per year, in %):");
        double rate = scanner.nextDouble();
        System.out.println("Time (in years):");
        int time = scanner.nextInt();

        double SI = (amt * rate * time)/100;
        System.out.println("SIMPLE INTEREST: ₹" + SI);
    }
}
