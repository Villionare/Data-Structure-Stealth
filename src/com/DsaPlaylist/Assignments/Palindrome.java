package com.DsaPlaylist.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    //A palindrome is a word, number, phrase, or sequence that reads the same forward and backward.
    //in this program i will check the palindrome for a string, number and a sentence


    private static boolean stringPalindrome(Scanner scanner){
//        You compare characters from the start and end moving inward.
//        You may ignore spaces, punctuation, and case for phrases.

        scanner.nextLine();
        System.out.print("Enter any Word: ");
        String word = scanner.nextLine().toLowerCase();

        int start = 0;
        int end = word.length()-1;

        while (start<end){
            if (word.charAt(start)!=word.charAt(end)){
                return false;
            }
                start++;
                end--;
        }
        return true;
    }

    private static boolean numberPalindrome(Scanner scanner){
        scanner.nextLine();
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();
        int check = number;

        int reversed = 0;

        while(number!=0){
            int remainder = number%10;
            reversed = reversed * 10 + remainder;
            number = number/10;
        }

        return reversed == check;
    }

    private static boolean sentencePalindrome(Scanner scanner){
//        Example: "A man, a plan, a canal, Panama"
//        Requires removing spaces, punctuation, and converting to lowercase before checking.

        scanner.nextLine();
        System.out.println("Enter a Sentence or a phrase: ");
        //punctuation marks will be removed e.g.,!. etc;

        String sentence = scanner.nextLine().toLowerCase();

        int start = 0;
        int end = sentence.length()-1;

        while (start<end){
            while(start<end && !Character.isLetterOrDigit(sentence.charAt(end))){
                end--;
            }
            while(start<end && !Character.isLetterOrDigit(sentence.charAt(start))){
                start++;
            }

            if (sentence.charAt(end)!=sentence.charAt(start)){
              return false;
            }

            end--;
            start++;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int run = Integer.MAX_VALUE;

        System.out.println("Welcome to palindrome Checker\nEnter you option");

        while (run!=0){
        System.out.println("1 - to check a string");
        System.out.println("2 - to check a sentence");
        System.out.println("3 - to check a number");
        System.out.println("0 - to exit.");

        run = scanner.nextInt();

        switch(run){
            case 1 -> System.out.println(stringPalindrome(scanner));
            case 2 -> System.out.println(sentencePalindrome(scanner));
            case 3 -> System.out.println(numberPalindrome(scanner));
            case 0 -> System.out.println("Thank you for using the application");
            default -> System.out.println("wrong keyword press choose form 1-2-3-0");
        }
        }
    }
}
