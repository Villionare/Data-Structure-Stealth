package NQT.Questions;

import java.util.Arrays;

public class RotateArray33 {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};

        //rotating array 1 step right
        //store the next - copy current

        int last = arr[arr.length-1];

        for (int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }
}
