package NQT.Questions;

import javax.swing.*;

public class FindMissingNumber28 {
    static void main(String[] args) {

        //firstly we will calculate the total sum of numbers from 1 to N is by formula n*(n+1)/2.
        //and then we will calculate the actual sum of the array if the same then there is no missing number.
        //and if it is not the same then we will do Supposed_sum - Actual_sum = missing number.

        int[] arr = {1, 2, 4, 5};

        //the sum of natural number will be
        int N = arr[arr.length-1];

        int sum = N*(N+1)/2;

        //now the actual sum of elements of the array:
        int actual_sum = 0;

        for (int s: arr){
            actual_sum += s;
        }

        int diff = sum-actual_sum;

        if (diff == 0)
            System.out.println("The is no missing no.");
        else
            System.out.println("There are missing nums: " + diff);
    }
}
