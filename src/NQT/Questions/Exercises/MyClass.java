package NQT.Questions.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClass{
    public static void main(String[] args) {

//THIS IS TO FIND ALL THE DUPLICATE ELEMENTS IN AN ARRAY

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int[] arr = {1,2,3,4,5,2,5,1,99,23};

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arrayList.add(arr[i]);
                    break;
                }
            }
        }

        System.out.println(arrayList);
    }
}