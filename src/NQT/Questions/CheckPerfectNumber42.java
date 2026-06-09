package NQT.Questions;

import java.util.Scanner;

//A perfect number is a positive integer that is equal to the sum of its proper divisors (all positive divisors excluding the number itself).
//Example: 6
//Divisors of 6: 1, 2, 3, 6
//Proper divisors: 1, 2, 3
//Sum: 1 + 2 + 3 = 6

public class CheckPerfectNumber42 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i=1;
        int sum = 0;

        while (i<=num/2){
            if (num%i == 0){
                sum += i;
            }
            i++;
        }

        System.out.println(sum==num ? "Perfect No":"Not a perfect No");
    }
}

//A more efficient version only checks up to num / 2 because no proper divisor (other than the number itself) can be greater than num / 2: