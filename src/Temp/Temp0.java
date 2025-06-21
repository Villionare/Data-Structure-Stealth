package Temp;

import java.util.Scanner;
//basic input-oupp
class Solution {
    public void printNumber(Scanner sc) {
        System.out.print("Enter an Integer\n");
        int a = sc.nextInt();
        System.out.print(a);
    }

    public static void main(String args[]) {
        Scanner Scanner = new Scanner(System.in);
        Solution solution = new Solution();
        solution.printNumber(Scanner);
        Scanner.close();
    }
}