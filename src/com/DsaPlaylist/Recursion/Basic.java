package com.DsaPlaylist.Recursion;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        //write a function that takes in a number and then prints first

        fun1(args);

    }

    static void fun1(String[] args){
        System.out.println(Arrays.toString(args));
        fun2();
        System.out.println("from fun1");
    }

    static void fun2(){
        fun3();
        System.out.println("from fun2");
    }
    static void fun3(){
        fun4();
        System.out.println("from fun3");
    }
    static void fun4(){
        System.out.println("from fun4");
    }

}