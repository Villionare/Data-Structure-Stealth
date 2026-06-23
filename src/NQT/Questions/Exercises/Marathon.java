package NQT.Questions.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Marathon{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> R = new ArrayList<>();

        System.out.println("Enter the distances covered by racers in Marathon (Kilometers)\nplease (press q to terminate):");

        while (true){
            String s = scanner.nextLine().toLowerCase();

            if (s.equals("q")){
                break;
            }

            R.add(Float.parseFloat(s));
        }

        //now arranging then in descending order
        R.sort(Collections.reverseOrder());

        //if ascending order : Collections.sort(R); || R.sort(null);

        System.out.println("Output Values\nHighest Distance excluding Finishers:");

        int count = 0;

        for (Float f: R){

            if (f>=42.195f){
                continue;
            }

            System.out.println(f);
            count++;

            if (count==3){
             break;
            }
        }
    }
}