package NQT.Questions;

import java.util.Scanner;

public class NinthLargetAmongThree {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first");
        int first = scanner.nextInt();
        System.out.println("Enter first");
        int second = scanner.nextInt();
        System.out.println("Enter first");
        int third = scanner.nextInt();

        int largest = Math.max(first, Math.max(second, third));
        System.out.println(largest);
    }
}
