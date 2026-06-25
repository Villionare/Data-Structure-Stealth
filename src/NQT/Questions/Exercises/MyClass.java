package NQT.Questions.Exercises;

import java.util.Arrays;

public class MyClass{
    public static void main(String[] args) {
//this program is to find out L CM

        int a = 10;
        int b = 18;

//firstly to find the lcm the formula is a * b / GDC(a,b)

        int max = Math.max(a,b);

        while(true){
            if(max%a==0 && max%b==0){
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }
}