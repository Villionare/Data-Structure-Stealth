package NQT.Questions;

import java.util.Scanner;

public class FourthFibonacci {
    public static void main(String[] args){

        int first = 0;
        int second = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many of the fibonacci series no you need:");


        if(scanner.hasNextInt()){
            int no = scanner.nextInt();



            for(int i=0;i<no;i++){
                if(i==0){
                    System.out.println(0);
                    continue;
                }

                if(i==1){
                    System.out.println(1);
                    continue;
                }

                int temp = first + second;
                System.out.println(temp);
                first = second;
                second = temp;
            }

        }else{
            System.out.println("Enter Interger no");
        }
        scanner.close();
    }
}