package NQT.Questions;

import java.util.Scanner;

public class EighthSumOfDigits {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int no = scanner.nextInt();
        int sum = 0;

        while (no!=0){
            int last = no % 10;
            sum += last;
            no /= 10;
        }

        System.out.println("the sum got is: " + sum);
    }
}
