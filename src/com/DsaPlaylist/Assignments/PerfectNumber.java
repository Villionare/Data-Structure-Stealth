package com.DsaPlaylist.Assignments;

import java.util.Scanner;

public class PerfectNumber {
    //A perfect number is a positive integer that is equal to the sum of its proper divisors
    // (divisors excluding the number itself).

    //e.g. 28 has proper divisors (jinse koi number properly devide ho jaaye) - 1,2,4,7,14 = divisiors
    // 1+2+4+7+14 = 28 (perfect number)

    public static void main(String[] args) {
        System.out.println("Check if a number is perfect or not");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        if (no <= 1) {
            System.out.println("Not a perfect number");
            return;
        }

        int sum = 1; // 1 is always a divisor

        //so it took a while to understand this loop fully. we take an example of number 32
        //so no = 36;
        //loop i = 2 se start karenge kyunki ye 1 universaly sabko devide karta hai (upper sum me uski value pehle he added hai)
        //so hum always number nahi uske root tak loop chanalenge ( i * i <= no), kyunki consider 36 ab iske
        //factors dekho 1 , 2 , 3 , 4 , 6

        // 1 - added hai
        // 2 * 18 = 36 hota hai to hum pehle sum me 2 add karenge phir if condition ke andar 18 bhi add karenge.
        // 3 * 12 = 36 hota hai to hum pehle sum me 3 add karenge phir if condition ke andar 12 bhi add karenge.
        // 4 * 9 = 36 hota hai to hum pehle sum me 4 add karenge phir if condition ke andar 9 bhi add karenge.
        // 6 * 6 = 36 but hame same divisior 2 baar add nahi karna isliye hamne if condition lagaya tha
        //taki upper wala sum (sum += i;) ik baar add karde and neeche wala jo if condition hai vo
        //(no/i != i) reject karde 6 dubara add karne se.

        //and bas yahi tha ye question,
        /// this question was not had i did it already bas ye wala execution effficient hai
        /// isiliye bc samajne pe baitha tha.

        for (int i = 2; i * i <= no; i++) {
            if (no % i == 0) {
                sum += i;
                if (i != no / i) { // Avoid adding sqrt twice
                    sum += no / i;
                }
            }
        }

        if (sum == no) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It's not a perfect number.");
        }

        scanner.close();
    }
}
