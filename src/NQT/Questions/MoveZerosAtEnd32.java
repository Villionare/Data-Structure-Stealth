package NQT.Questions;

import java.util.Arrays;

public class MoveZerosAtEnd32 {
    static void main() {
        System.out.println("This is program to move all the zeros in an array to the end");
        int[] arr = {
                5, 0, 12, 7, 0,
                9, 15, 0, 3, 8,
                0, 11, 14, 6, 0,
                2, 10, 13, 0, 4
        };

        int index = 0;

        // Move all non-zeros to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

//    my approach
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == 0) {
//            for (int j = i; j < arr.length - 1; j++) {
//                arr[j] = arr[j + 1];
//            }
//
//            arr[arr.length - 1] = 0;
//            i--; // recheck current position
//        }
}

