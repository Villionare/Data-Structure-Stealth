package NQT.Questions;

import java.util.Scanner;

public class EleventhCheckLCM {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input first");
        int a = scanner.nextInt();

        System.out.println("input second");
        int b = scanner.nextInt();
        int x = a, y = b;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}
