package NQT.Questions.Exercises;

public class MyClass{
    public static void main(String[] args) {
//binary search

        int[] arr = {1,3,5,7,8,9,23,68,90};

        int target = 8;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]>target){
                end = mid - 1;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else{
                System.out.println("Found the element at : " + mid);
                break;
            }

        }

    }
}