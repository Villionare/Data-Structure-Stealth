package com.DsaPlaylist.Assignments;


import Process_onliceCourse.LinkedList.Temp;

import java.util.Scanner;

public class HcfAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two no to find hcf and lcm");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("HCF:" + HCF(a, b));
        System.out.println("LCM:" + LCM(a, b));
    }

    static int HCF(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    static int LCM(int a,int b){

        return (a*b)/HCF(a,b);
    }
}
