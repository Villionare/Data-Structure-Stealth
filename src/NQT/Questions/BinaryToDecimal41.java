package NQT.Questions;

//To convert binary → decimal, process each digit from right to left and multiply it by the corresponding power of 2.
// 1 × 2³ + 1 × 2² + 0 × 2¹ + 1 × 2⁰ = 13
//8+4+0+1=13

import java.util.Scanner;

public class BinaryToDecimal41 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number: ");
        int num = sc.nextInt();

        int expo = 0;
        int decimal = 0;

        while (num>0){
            decimal += (int) (Math.pow(2, expo++) * (num % 10));
            num /= 10;
        }

        System.out.println(decimal);
    }
}
