package com.DsaPlaylist.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> first = new ArrayList<>(30);
//
//        first.add("this");
//        first.add("is");
//        first.add("a");
//        first.add("ArrayList");
//        first.add("hahhh....");
//
//        System.out.println(first);

        //2D ArrayLists using ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation - just adding arraylist as elements, cuz the elements are null by default
        for (int i =0;i<3;i++){
            list.add(new ArrayList<>()); // we are just creating defined 2d array of size 4 with
                                         //arraylist as elements and by iteration we can iterate over the elements
        } //output - [[], [], [], []]

//        for (int i = 0; i <5;i++){
//            ArrayList<Integer> temp = new ArrayList<>();
//            for (int j = 0; j<5;j++){
//                System.out.printf("list[%d][%d] = ",i,j);
//                temp.add(scanner.nextInt());
//            }
//            list.add(temp);
//        }

        for (int i = 0; i <3;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j<3;j++){
                System.out.printf("list[%d][%d] = ",i,j);
               list.get(i).add(scanner.nextInt());
            }
        }
        System.out.println(list);
    }
}
