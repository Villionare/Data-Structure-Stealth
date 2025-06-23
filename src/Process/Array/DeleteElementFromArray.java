package Process.Array;

import java.util.Scanner;

//this program will delete an element from a specific position from an array
public class DeleteElementFromArray {

    void deleteElement(char[] arr,int pos){

        for(int i = pos-1 ; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        char[] arr = new char[size];

        System.out.println("Enter the elements now: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        System.out.print("So, the Array is ");
        for (char i : arr) {
            System.out.print(i);
        }
        System.out.println("\n");
        System.out.println("Enter the position of an element to delete:");
        int position = scanner.nextInt();

        DeleteElementFromArray obj = new DeleteElementFromArray();
        obj.deleteElement(arr, position);

        for (char i : arr) {
            System.out.println(i);
        }
    }
}