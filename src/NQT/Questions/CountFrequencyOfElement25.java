package NQT.Questions;

import java.util.Scanner;

public class CountFrequencyOfElement25 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows and columns that you wanna create an array of:");

        System.out.println("Row: ");
        int row = scanner.nextInt();

        System.out.println("Columns: ");
        int col = scanner.nextInt();

            int[][] arr = new int[row][col];

            for (int i=0; i<arr.length; i++){
                for (int j=0; j<arr[0].length; j++){
                    System.out.printf("Enter element at arr[%d][%d]: ",i,j);
                    arr[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Array is full now!\nNow enter the element that you wanna find the Frequency Of: ");

            int count=0;
            int check = scanner.nextInt();

            for (int[] ints : arr) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (ints[j] == check) {
                        count++;
                    }
                }
            }

            System.out.println("It has been calculated the element "+check+" has appeared " + count + " times");
    }
}
