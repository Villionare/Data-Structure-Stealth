package NQT.Questions;

public class TwentyTwoInsertionSort {

        public static void insertionSort(int[] arr) {

            for(int i=1; i<arr.length; i++){

                //we firstly take a key
                int key = arr[i];
                int j = i-1;

                //this loop will continue to swap elements from current i till arr[0] if arr[j]>key
                while (j>=0 && arr[j]>key){

                    arr[j+1] = arr[j];
                    j--;

                }

                //and now as the arr[j]<key we will place the key just after it (which is an empty space now)
                arr[j+1] = key;
            }

        }

        public static void main(String[] args) {
            int[] arr = {5, 2, 4, 6, 1, 3};

            insertionSort(arr);

            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}
