package NQT.Questions;

import java.util.Scanner;

public class SeventhArmstrong {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");

        if(scanner.hasNextInt()){
        int no = scanner.nextInt();
        int check = no;
        int new_no = 0;

        while (no!=0){

            int last = no%10;
            new_no = new_no + (last * last * last);
            no /= 10;

        }

        if (check == new_no){
            System.out.println("arm");
        }else{

            System.out.println("no arm");
        }
        }else {
            System.out.println("Enter integer only");
        }

    }
}
