package NQT.Questions;

//A Strong Number is a number whose value is equal to the sum of the factorials of its digits.
//Example: 145

//Digits: 1, 4, 5

//Factorials:
//1! = 1
//4! = 24
//5! = 120

//Sum: 1 + 24 + 120 = 145

import java.util.Scanner;

public class CheckStrongNumber43 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        int check =  num;

        while (check>0){
            int temp = check %10;
            sum += factorial(temp);
            check /= 10;
        }

        System.out.println(sum==num? "Strong": "Weak");
    }

    private static int factorial(int no){

        int result = 1;

        for (int i=no; i>=1; i--){
            result *= i;
        }

        return result;
    }
}
