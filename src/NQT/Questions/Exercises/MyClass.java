package NQT.Questions.Exercises;

import java.util.Arrays;

public class MyClass{
    public static void main(String[] args){
//checking palindrome

        int no = 12321;
        int original = no;
        int reverse = 0;

        while (no>0){
            int last = no%10;
            reverse = reverse * 10 + last;
            no /= 10;
        }

        System.out.println(reverse);

        if (original == reverse){
            System.out.println("Palindrome!");
        }else {
            System.out.println("Not");
        }
    }
}