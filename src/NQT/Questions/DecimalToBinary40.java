package NQT.Questions;

import java.util.Scanner;

//The idea is:
//Divide the number by 2.
//Store the remainder (0 or 1).
//Continue until the number becomes 0.
//Read the remainders in reverse order.

public class DecimalToBinary40 {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n/=2;
        }
        System.out.println(binary);
        sc.close();
    }
}
