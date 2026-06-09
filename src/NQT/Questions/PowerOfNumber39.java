package NQT.Questions;

import java.util.Scanner;

public class PowerOfNumber39 {
    static void main() {

        System.out.println("this is a program to find the power of a number");

        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt();
        int exp=sc.nextInt();
        int result=1;
        for(int i=1;i<=exp;i++)
            result*=base;
        System.out.println(result);
    }
}
