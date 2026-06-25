package NQT.Questions;

//Start at the beginning of the list.
//Compare the first two elements.
//If the first is greater than the second, swap them.
//Move to the next pair and repeat.
//Continue until you reach the end — this completes one pass.
//Repeat passes until no swaps are needed.

import java.util.Arrays;

public class TwentyBubbleSort {

    static void main() {

        // in bubble sort we will just do the same loop as selection but
        //here we are not storing min, index to replace in outer loop we are just doing at
        //every step we are finding an element smaller than arr[i];

        int[] arr = {12, 4, 8, 15, 1, 10, 3, 6};

        for(int i=0; i<arr.length-1; i++){

            for (int j=i+1; j<arr.length; j++){

                if(arr[i]>arr[j]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
