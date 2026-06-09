package NQT.Questions;

//The intersection of two arrays means:
//
//Find all elements that are present in both arrays.

public class IntersectionTwoArrays45 {
    static void main() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i: arr1){
            for (int j: arr2){
                if (i==j){
                    System.out.println(i);
                }
            }
        }
    }
}
