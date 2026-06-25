package NQT.Questions.Exercises;

import java.util.Arrays;

public class MyClass{
    public static void main(String[] args) {
        //this program is to find out weather two strings are anagram or not
        String o = "Silent";
        String t = "Listen";

        String one = o.toLowerCase().trim();
        String two = t.toLowerCase().trim();
        char[] oo = one.toCharArray();
        char[] tt = two.toCharArray();

        Arrays.sort(oo);
        Arrays.sort(tt);

        if(Arrays.equals(oo, tt)){
            System.out.println("Anagram");
        }else{
            System.out.println("not Anagram");
        }
    }
}