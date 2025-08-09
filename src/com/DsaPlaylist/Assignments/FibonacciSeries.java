package com.DsaPlaylist.Assignments;

import java.util.Scanner;

//It’s a sequence of numbers where:
//First two numbers are fixed:
//Every number after that is the sum of the previous two numbers:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Generator:");
        System.out.println("Enter the no of palindrome to generate");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0;i<=n;i++){
            if (i==0){
                System.out.print(i + " ");
            } else if (i==1) {
                System.out.print(i + " ");
            }else{
                int next = a+b;

            System.out.print(next+" ");
            a = b;
            b = next;
            }

        }
    }
}
