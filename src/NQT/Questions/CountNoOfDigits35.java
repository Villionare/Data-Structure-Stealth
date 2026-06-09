package NQT.Questions;

public class CountNoOfDigits35 {
    static void main() {

        System.out.println("Counting the no of digits in a number.");

        int n = 4534642;
        int count = 0;

        while (n != 0){
            count++;
            n = n/10;

        }

        System.out.println(count);
    }
}