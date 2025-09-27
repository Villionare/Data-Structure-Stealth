package com.DsaPlaylist.Recursion;
import java.util.Scanner;

//when we write the recursion in a relation it is called recurrence relation

//we have to find the nth fibonacci number

//to solve a recurrence problem:
//try to identify the recurrence relation
//try to figure out the recursive tree

public class FibonaachiSeries {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the place from where you wanna find no of");
        int n = scanner.nextInt();
        System.out.println(FibonaNext(n));

    }

    static public int FibonaNext(int n){
        if(n<2){
            return n;
        }
        return FibonaNext(n-2) + FibonaNext(n-1);
    }
}
