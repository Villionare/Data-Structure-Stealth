package NQT.Questions;

import java.util.Scanner;

public class RemoveCharStiring47 {
    static void main() {

        Scanner sc=new Scanner(System.in);
        String string = "The Quick Brown Fox Jumps over the Lazy Dog";
        char ch=sc.next().charAt(0);
        string=string.replace(Character.toString(ch),"");
        System.out.println(string);
        sc.close();
    }
}