package com.DsaPlaylist.Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        if (no < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1;
            for (int i = 2; i <= no; i++) {
                fact *= i;
            }
            System.out.println(no + "! = " + fact);
        }

        scanner.close();
    }
}
