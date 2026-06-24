package NQT.Questions.Exercises;

import java.util.Arrays;

public class MyClass{
    public static void main(String[] args){
//program to check weather an array is sorted or not

        int[] arr = {1,2,3,4,5,6,99};

        for(int i=0; i<=arr.length-2; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
                    return;
            }
        }

        System.out.println("sorted");
    }
}