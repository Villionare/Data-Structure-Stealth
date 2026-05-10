package NQT.Questions;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check weather it is Palindrome or not: ");

        String str = scanner.nextLine();
        String palindrome="";

        for(int i=str.length()-1;i>=0;i--){
            palindrome += str.charAt(i);
        }

        if(str.equals(palindrome)){
            System.out.println("Yes P");
        }else{
            System.out.println("No P");
        }
    }
}