package NQT.Questions;

import java.util.ArrayList;

public class FindDuplicateElementsArray31 {
    static void main() {
        int[] arr = {2,3,4,5,67,7,8,9,2,5,7,2};

        System.out.println("This is a program to find all the duplicate elements in the array and print them");

        for (int i=0; i<arr.length; i++){

            boolean alreadyCounted = false;
            int count=1;

            for (int c=0; c<i; c++){
                if (arr[c] == arr[i]){
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted){
                for (int j=i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }

            if (count != 1)
                System.out.println(arr[i] + " appeared " + count + " times.");
            }

        }
    }
}
