package NQT.Questions.Exercises;

import java.util.Arrays;

public class MyClass{
    public static void main(String[] args){

        //checking palindrome string
        String str = "Malayalam";
        String check = str.trim().toLowerCase();
        int left = 0;
        int right = check.length()-1;

        while (left<right){
            if(check.charAt(left)!=check.charAt(right)){
                System.out.println("not");
                return;
            }

            left++;
            right--;
        }

        System.out.println("yes");
    }
}