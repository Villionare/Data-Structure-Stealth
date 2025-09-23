package com.DsaPlaylist.Strings;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String... args) {
        String str = "this is another";
        String str1 = "this is another";

        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        String s1 = new String("first");
        String s2 = new String("first");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.indexOf("r"));
        System.out.println(s1.charAt(3));

        for (String a: args){
            System.out.println(a);
        }

        System.out.println('a'+'v');
        System.out.println("aa" + 33);

        int a = 45;
        String check = "wooo";

        System.out.println((a + check).getClass().getSimpleName());

        List<Integer> start = new ArrayList<>();
        start.addFirst(454);
        start.add(4444);

        System.out.println(("bhasa" + start).getClass().getName());

        //experiments
        char ad = 'a';

        for (int i=0; i<= 10; i++){
            System.out.print((char)(ad + i)+" ");
        }


        StringBuilder tryout = new StringBuilder("va");
//        tryout.append("out");

        StringBuilder tryout1 = new StringBuilder("va");

        System.out.println(tryout);
        System.out.println((tryout.toString()).equals(tryout1.toString()));
    }
}
