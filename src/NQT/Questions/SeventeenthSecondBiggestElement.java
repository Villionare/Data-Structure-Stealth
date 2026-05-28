package NQT.Questions;

import java.util.Arrays;

public class SeventeenthSecondBiggestElement {
    static void main(String[] args) {
        int[] arr = {1,2,7,4,6,8567,5,45,23,546,765};

        Arrays.sort(arr);

        for (int i = arr.length-1; i>0; i--){

            if(arr[i]>arr[i-1]){
                System.out.println(arr[i-1]);
                break;
            }
        }
    }
}
