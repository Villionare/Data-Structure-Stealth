package NQT.Questions;

//            *
//            **
//            ***
//            ****

import javax.swing.*;
import java.util.Scanner;

public class StarPattern38{
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a program to print star patterns\n Enter the rows to print one:");
        System.out.print("Rows: ");
        int row = scanner.nextInt();

        for (int i=1;i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
