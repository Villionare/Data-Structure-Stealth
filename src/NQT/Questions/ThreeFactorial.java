package NQT.Questions;

import java.util.Scanner;

public class ThreeFactorial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no that you wanna find factorial off: ");
        int no = scanner.nextInt();

        for(int i=no-1;i>=1;i--){
            no *= i;
        }
        System.out.println("Factorial of the no is " + no);

        scanner.close();
    }
}