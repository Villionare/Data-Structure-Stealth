package com.DsaPlaylist.LinerSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arrayForSearch = {1, 354, 5, 23, 67, 34, 90, 876, 22};

//        System.out.println("So, the array is: " + Arrays.toString(arrayForSearch));
//        System.out.print("Enter the element to search: ");
//        int search = scanner.nextInt();
//        int index = linearSearch(arrayForSearch, search);
//
//        if (index>=0){
//            System.out.println("Found element at index: "+ index);
//        } else {
//            System.out.println("Element not Found!");
//        }

        String str = "Mitochondria";
        System.out.println(str + "\nEnter the char to search: ");
        char target = scanner.next().charAt(0);
        int result = linearSearch_String(str, target);
        if (result>=0){
            System.out.println("Found Character at index: "+ result);
        } else {
            System.out.println("Character not Found!");
        }
        scanner.close();
    }

    //linear search in an array
    static int linearSearch(int[] arr, int element) {

        if (arr.length == 0){
            return -1;
        }

        //searching for element at every index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch_String(String str, char target){

        if (str.isEmpty()){
            return Integer.MIN_VALUE;
        }

//        for (int i = 0; i < str.length(); i++){
//
//            if (Character.toLowerCase(str.charAt(i)) == target){
//                return i;
//            }
//
//        }

        for (char item : str.toCharArray()){
            if (item == target){
                return 1 ;
            }
        }
        return Integer.MIN_VALUE;
    }
}
