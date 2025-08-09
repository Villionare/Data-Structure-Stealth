package com.DsaPlaylist.Assignments;

import java.util.Scanner;

public class HcfAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two no to find hcf and lcm");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Answers:");
        System.out.println("HCF:" + HCF(a, b));
//        System.out.println("LCM:" + LCM(a, b));
    }

//    This code uses Euclid’s Algorithm for HCF (also called GCD). The logic behind it is:
//    "The HCF of two numbers doesn’t change if you replace the larger number with its remainder
//    when divided by the smaller number".
//    so after every iteration of the while loop (a,b) will be -> (smaller number b/w a & b, a % b)
//    and at last when the b == 0, the value of a will be the answer

    static int HCF(int a, int b){
        while (b!=0){
            System.out.printf("HCF(%d, %d)\n", a, b);
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
//    Why this works:
//    At each step, we’re shrinking the problem to a smaller pair (smaller number, remainder).
//    When remainder becomes 0, the current a is the largest number that divides both numbers evenly.

    static int LCM(int a,int b){
        return (a*b)/HCF(a,b);
    }
}