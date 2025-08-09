package com.DsaPlaylist.Assignments;

//program to calculate average of n numbers;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        System.out.print("Enter the number till which you want to calculate the average:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        }while (i<=no);

        System.out.println("Average: " + sum/no);
        scanner.close();
    }
}
