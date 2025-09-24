package com.DsaPlaylist.Recursion;

//base condition - the condition that ultimately stops the recursion at some check.

public class RecusionBiggner {
    static void main() {

    //using recursion on a function to print from a input  to 100000
    print(1);


    }

    static void print(int n){

        if ((n <= 10)) {
        System.out.println(n);
            print(n + 1);
        } else {
            return;
        }
    }
}
