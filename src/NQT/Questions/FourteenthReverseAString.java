package NQT.Questions;


import java.util.Scanner;

public class FourteenthReverseAString {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string that you wanna reverse");
        String reversed = "";

        if(scanner.hasNextLine()){

            String input = scanner.nextLine();
            for(int i=input.length()-1; i>=0; i--){
                reversed += input.charAt(i);
            }

            System.out.println(reversed);
        }
    }
}
