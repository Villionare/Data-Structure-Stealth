package Process_onliceCourse;

import java.util.Scanner;

public class QuickSort {

    private static void quickSort(int[] arr, int size){
        float no = (float) size /2;
        int pivot = Math.round(no);

        System.out.println(pivot);

        for (int i = 0; i <= pivot;i++){
            if (arr[i]<arr[pivot]){
                continue;
            }else if (arr[i]>arr[pivot]){

            }
        }
    }

    public static void main(String[] args) {
        int[] arr;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size for array");
        int size = scanner.nextInt();
        arr = new int[size];

//        for (int i = 0; i<size;i++){
//            System.out.printf("Enter the %d element: ",i);
//            arr[i] = scanner.nextInt();
//        }

        quickSort(arr, size);

        for (int i: arr){
            System.out.printf("%d ", i);
        }
        scanner.close();
    }
}