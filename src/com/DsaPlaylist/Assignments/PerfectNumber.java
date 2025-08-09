package com.DsaPlaylist.Assignments;

import java.util.Scanner;

public class PerfectNumber {
    //A perfect number is a positive integer that is equal to the sum of its proper divisors
    // (divisors excluding the number itself).

    //e.g. 28 has proper divisors (jinse koi number properly devide ho jaaye) - 1,2,4,7,14 = divisiors
    // 1+2+4+7+14 = 28 (perfect number)

    public static void main(String[] args) {
        System.out.println("Check if a number is perfect or not");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        if (no <= 1) {
            System.out.println("Not a perfect number");
            return;
        }

        int sum = 1; // 1 is always a divisor

        for (int i = 2; i * i <= no; i++) {
            if (no % i == 0) {
                sum += i;
                if (i != no / i) { // Avoid adding sqrt twice
                    sum += no / i;
                }
            }
        }

        if (sum == no) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It's not a perfect number.");
        }

        scanner.close();
    }
}
