package NQT.Questions.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {

//program to write fibonacchi series upto certain point

        Scanner sc = new Scanner(System.in);
        int inp = 0;

        System.out.print("Enter how many Fibonacci series you wanna print: ");

        while(true){

            if(sc.hasNextInt()){
                inp = sc.nextInt();
                break;
            }else{
                System.out.println("Error! Enter an Integer number");
                sc.next();
            }
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for(int n=1; n<=inp; n++){
            System. out.printf(" %d,",a);

            c = a+b;
            a = b;
            b = c;
        }
    }
}