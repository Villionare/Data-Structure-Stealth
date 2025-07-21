package Process_onliceCourse.Array;

import java.util.Scanner;



public class ArrayElementsShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the array\n");

        int arraySize = scanner.nextInt();
        arraySize++;
        char[] arr = new char[arraySize];

        for (int i = 0; i < (arraySize - 1); i++) {
            System.out.print("Enter the " + i + " Element: ");
            arr[i] = scanner.next().charAt(0); //read the first character only
        }

        for (char i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("Enter the position from where you want to insert " + "\"J\"");
        int postion = scanner.nextInt();

        insertElement(arr, postion, 'J');

        for (char i : arr) {
            System.out.print(i+" ");
        }
    }

    static void insertElement(char[] arr, int pos, char a){

        for (int i = arr.length-1; i>= pos; i--){
            arr[i] = arr[i-1];
        }

        arr[pos -1] = a;

    }
}