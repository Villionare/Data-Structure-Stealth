package NQT.Questions;

import java.util.Scanner;

public class TwelthCheckLeapYear {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");

        if(scanner.hasNextInt()){
            int year = scanner.nextInt();

            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }

        }else {
            System.out.println("Enter a Integer Year");
        }
    }
}
