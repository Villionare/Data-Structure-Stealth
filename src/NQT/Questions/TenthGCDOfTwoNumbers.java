package NQT.Questions;

import java.util.Scanner;

public class TenthGCDOfTwoNumbers {

    //we will do it using euclidian alsogrithem
    //GCD(A,B) = GCD(B, A%B)

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first no");
        int no1 = scanner.nextInt();
        System.out.println("Enter Second no");
        int no2 = scanner.nextInt();

        while (no2!=0){
            int temp = no2;
            no2 = no1 % no2;
            no1 = temp;
        }

        System.out.println("GCD IS : " + no1);
    }
}
