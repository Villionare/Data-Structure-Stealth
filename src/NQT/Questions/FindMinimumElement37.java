package NQT.Questions;

public class FindMinimumElement37 {
    static void main() {
        System.out.println("This is a program to find the minimum element in an array");

        int[] arr = {42, 17, 89, 5, 63, 28, 91, 14, 37, 76,
                3, 58, 22, 95, 11, 67, 40, 84, 19, 50};

        int minimum = arr[0];

        for (int i: arr) if (i<minimum) minimum = i;

        System.out.println(minimum);
    }
}
