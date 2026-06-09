package NQT.Questions;

public class CountEvenOdd44 {

    static void main() {
        int[] arr = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};

        int even = 0;
        int odd = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("This array has " +even+ " even and " + odd + " odds.");
    }
}
