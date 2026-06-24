package NQT.Questions.Exercises;

import java.util.Arrays;

public class MyClass{
    public static void main(String[] args) {
//this program is to covert a decimal no into binary

        int no = 3453;
        String binary = "";

        while(no>0){
            int last = no%2;
            binary = last + binary;
            no /= 2;
        }

        System.out.println(binary);
    }
}