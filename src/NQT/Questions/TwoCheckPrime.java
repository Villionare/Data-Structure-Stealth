package NQT.Questions;
import java.util.Scanner;

public class TwoCheckPrime {
    public static void main(String[] args){

        boolean prime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no you wanna check as prime: ");

        if(scanner.hasNextInt()){

            int no = scanner.nextInt();

            for(int i=2;i<=no/2;i++){
                if(no%i==0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                System.out.println("This is a prime no");
            }else{
                System.out.println("Not a prime no");
            }

        }else{
            System.out.println("Enter an integer");
        }

    }
}