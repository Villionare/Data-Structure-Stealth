package NQT.Questions;

import java.util.Scanner;

public class SixteenthRemoveDuplicateFromStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String that you wanna remove duplicate char of: ");

        String inp = scanner.nextLine();

        String resultant = "";

        for (int i=0; i<inp.length(); i++){
            char check = inp.charAt(i);

            if(resultant.indexOf(check)==-1){
                resultant+=check;
            }
        }

        System.out.println(resultant);

    }
}
