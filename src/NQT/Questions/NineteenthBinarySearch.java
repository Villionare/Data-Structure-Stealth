package NQT.Questions;

public class NineteenthBinarySearch {

    static void main() {
        //binary search can only be done on an sorted array

        int[] arr = {1,3,5,7,8,9,23,68,90};

        int target = 8;
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            } else if (arr[mid]==target) {
                System.out.println("Found the target at: " + mid);
                break;
            }
        }
    }
}
