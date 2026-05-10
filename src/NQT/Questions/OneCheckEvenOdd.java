package NQT.Questions;

import java.util.Scanner;

public class OneCheckEvenOdd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no you wanna check as odd or even");

        if(scanner.hasNextInt()){

        int no = scanner.nextInt();
        if(no%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        }else {
            System.out.println("Enter a Integer");
        }
    }
}
