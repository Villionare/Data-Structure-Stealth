package NQT.Questions;

import java.util.Arrays;
import java.util.Scanner;

//just arrange it in ascending order man

public class FifteenthAnagramChecker {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string");
        String first = scanner.nextLine().toLowerCase().trim();

        System.out.println("Enter the Second string");
        String second = scanner.nextLine().toLowerCase().trim();

        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        if (Arrays.equals(firstArr, secondArr)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }

}

//    static void main() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the first string");
//        String first = scanner.nextLine().toLowerCase().trim();
//
//        System.out.println("Enter the Second string");
//        String second = scanner.nextLine().toLowerCase().trim();
//
//        if(first.length() ==  second.length()){
//
//            char[] firstArr = first.toCharArray();
//            char[] secondArr = second.toCharArray();
//
//            boolean isThere = false;
//
//            for (char c : firstArr) {
//
//                isThere = false;
//
//                for (char value : secondArr) {
//                    if (c == value) {
//                        isThere = true;
//                        break;
//                    }
//                }
//
//                if(!isThere){
//                    break;
//                }
//
//            }
//
//            if (isThere){
//                    System.out.println("Is an Anagram");
//            }else {
//                    System.out.println("Not an Anagram.");
//            }
//
//        }else {
//            System.out.println("Not an Anagram.");
//        }
//    }