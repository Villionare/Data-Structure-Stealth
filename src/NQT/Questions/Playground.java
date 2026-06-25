package NQT.Questions;

import java.util.Arrays;

public class Playground {
    static void main() {

        int[] arr = {12, 4, 8, 15, 1, 10, 3, 6};

        for(int i=0; i<arr.length-1; i++){

            int minimum = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[minimum]>arr[j]){
                    minimum = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }



        System.out.println(Arrays.toString(arr));
    }
}
