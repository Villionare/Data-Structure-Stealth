package Temp;

import java.util.Scanner;

public class Switch {
    public void whichWeekDay(int day) {
        if(day<1 || day>7){
            System.out.print("Invalid");
        } else {
            switch (day){
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
    }

    public static void main(String[] args) {
        Switch s = new Switch();
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        s.whichWeekDay(day);
    }
}
