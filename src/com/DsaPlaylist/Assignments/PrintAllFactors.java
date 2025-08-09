package com.DsaPlaylist.Assignments;

import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        System.out.println("Program to list all the factors: ");
        System.out.println("Enter the no: ");
        Scanner scanner = new Scanner(System.in);

        int no = scanner.nextInt();

//using for loop
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                System.out.println(i);
            }
        }

//using while loop
//        int i = 1;
//        do {
//            if (no%i==0){
//                System.out.println(i);
//            }
//            i++;
//        }while (i<=no);

//while
//        while (i<=no){
//            if (no%i==0){
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
    }
}
