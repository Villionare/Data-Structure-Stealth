package NQT.Questions;

public class CheckSorting26 {
    static void main() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean sorted = true;
        System.out.println("This a program to check weather an array is sorted or not");

        for (int i=0;i<arr.length-1; i++){

            if (arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }

        if (sorted)
            System.out.println("Array is sorted");
        else
            System.out.println("No the array is not sorted.");

    }
}
