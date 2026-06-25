package NQT.Questions;

import java.util.Scanner;

public class ThirteenthCountVowelsAndConsonants {
    static void main(String[] args) {

        int vowels = 0;
        int consonant = 0;
        char[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word");

        if(scanner.hasNextLine()){
        String inp = scanner.nextLine().toLowerCase();
        array = inp.toCharArray();


            for (char value : array) {


               if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u'){
                   vowels++;
               }else if(Character.isLetter(value)){ //will ignore the digits/spaces/special characters
                   consonant++;
               }

            }

            System.out.println("Vowels: " + vowels + " and Consonants are: " + consonant);
        }
    }
}
