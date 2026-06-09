package NQT.Questions;

public class SumAllElements36 {
    static void main() {
        System.out.println("This program is to find the sum of all the digits in an array");

        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int digit : digits) sum += digit;

        System.out.println(sum);
    }
}
