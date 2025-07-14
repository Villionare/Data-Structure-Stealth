package Collections_youtube.List.ArrayList;

import java.util.*;

class stringSorting implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return a.length() - b.length(); //asscending
        //return b.length() - a.length(); //descending
    }
}

class descendingSorting implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }

// this is my observation for understanding this a-b & b-a
//    int compare(int a,int b){
//        int z = a-b;
//        int z = b - a;
//        if(z < 0){
//            //then this is okay
//            //a = 1
//            //b = 2
//
//        } else {
//            //b = 1
//            //a = 2
//        }
//    }
//}
}

public class Arraylist {

    public static void main(String[] args) {

        List<String> lone = new ArrayList<>();

        lone.add("now");
        lone.add("begins");
        lone.add("the");
        lone.add("game");

        List<String> lone2 = new ArrayList<>(lone);
        lone2.add("finally");

        System.out.println(lone2);

        List<String> list3 = new ArrayList<>(5);
        //we can define the initial capacity of the array list &
        //the inner array will be of that size
        //now when we will add elements more than 5,
        // then the size of the array will be increased by 1.5x

        list3.addAll(lone);

        System.out.println(list3);

        lone.remove("this");

        List<Integer> list4 = new ArrayList<>();

        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);

//        list4.remove(6);
        //here we want to remove the element 6 but,
        //by default when we will remove the an int element the remove() method starts to consider
        //it as an index so to remove the element 6 we have to pass it as object
        list4.remove(Integer.valueOf(6));
        System.out.println(Integer.valueOf(6));//it will remove the first occurrence of 6

        int a[] = new int[10];
        int b[] = new int[10];

        a[0] = 5;
        b = a.clone();

        List<int[]> ltwo = Arrays.asList(a);
        //this is unmodifiable list, where elements can be replaced

        System.out.println(ltwo.getClass().getName());

        List<String> ofList = List.of("this", "is", "a", "of", "list");
        //this is a fixed size list unmodifiable list, not even replace

        List<Integer> sortingList = new ArrayList<>();
        sortingList.add(6);
        sortingList.add(4);
        sortingList.add(3);
        sortingList.add(2);
        sortingList.add(1);
        sortingList.add(5);

        //we can sort using Collections class
        Collections.sort(sortingList);

        //but, also using the object:
        sortingList.sort(null);
        System.out.println(sortingList);
        //this method takes Comparator as an arguments then compare to values to perform custom sorting

        //assume how are we gonna sort in descending order or Based on length.
        //we have initialised a class ehich implements to the Comparator, which finally sorts and we
        //are using its object in here:
        sortingList.sort(new descendingSorting());

//        sortingList.sort((m, n)->n-m);
        //this is by using lambda expressions
        System.out.println(sortingList);

        //we lets sort the strings based upon their length, approach is the same we just have to use
        //.length property
        List<String> stringForSorting = new ArrayList<>();
        stringForSorting.add("this");
        stringForSorting.add("is");
        stringForSorting.add("a");
        stringForSorting.add("list");
        stringForSorting.add("for");
        stringForSorting.add("sorting");

        stringForSorting.sort(new stringSorting());

        //this is the easy method by using the lambda expressions
//          stringForSorting.sort((x, y) -> x.length() - y.length());
        System.out.println(stringForSorting);
    }
}
