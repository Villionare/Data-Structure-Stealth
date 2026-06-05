package NQT.Questions;

import java.util.Arrays;

public class twentyOneSelectionSort {
    static void main() {

        //this is just that comparing one to all
        //then when ever current one is bigger we will replace it with smaller one.

        int[] arr =  {34,67,340,934,765,23,78,893,4,78,312,7698,1};

        for (int i = 0; i<arr.length-1; i++){

            int min_index=i;

            for (int j = i+1; j<arr.length; j++){

                if(arr[j]<arr[min_index]){

                    //getting the smallest element index that can be later used to replace with it.
                    min_index = j;
                }
            }

            //now we will replace in here.
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }
}
