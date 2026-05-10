package NQT.Questions;

import java.util.Scanner;

public class FifthReverseNumber {
    public static void main(String[] args){

        int neww = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no that you wanna reverse");

        int no = scanner.nextInt();

        while(no != 0){

            int last = no%10;
            neww = neww * 10 + last;
            no = no/10;

        }

        System.out.println("reversed no is " + neww);

        scanner.close();
    }
}