package com.DsaPlaylist.Assignments;

import java.util.Scanner;

//✅ A year is a leap year if:
//It is divisible by 4
//Except if it is divisible by 100 — then it’s NOT a leap year
//Unless it is also divisible by 400 — then it IS a leap year

public class LeapYearCalucator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

