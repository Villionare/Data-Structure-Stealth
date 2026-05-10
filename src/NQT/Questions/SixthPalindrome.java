package NQT.Questions;

import java.util.Scanner;

public class SixthPalindrome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no to check weather it is Palindrome or not: ");

        int no = scanner.nextInt();
        int original=no;
        int palindrome=0;

        while(no!=0){

            int last = no%10;
            palindrome = palindrome * 10 + last;
            no /= 10;

        }

        if(original == palindrome){
            System.out.println("Yes P");
        }else{
            System.out.println("No P");
        }
    }
}