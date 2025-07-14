package Collections_youtube.List.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Tester {

    public static void main(String[] args) {

        //this is a special one - as it creates copy of the List when there is any modification going on
        //when the modification gets done it changes the references to the new one
        //- All mutative operations (add, set, remove, etc.) create a new copy of the underlying array.
        //- Ideal when reads vastly outnumber writes.

        CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();

        cowal.addLast(287);
        cowal.addLast(263);
        cowal.addLast(239);
        cowal.addLast(260);
        cowal.addLast(234);
        cowal.addLast(252);

        //let's take the example of ArrayList
        ArrayList<String> alist = new ArrayList<>();
        alist.add("this");
        alist.add("is");
        alist.add("a");
        alist.add("Array");
        alist.add("List.");

//        for (String item : alist){
//            System.out.println(item);
//
//            if (item.equals("Array")){
//                alist.add("yuuuu huuuu");
//                //This will show an error as we can't modify a list concurrently
//                //we can solve this issue by CopyOnWriteArrayList
//            }
//        }

        for (Integer item : cowal){
            System.out.println(item);

            if (item.equals(260)){
                int temp = cowal.indexOf(260);
                cowal.add(++temp, 999);
            }
        }

        System.out.println(cowal);
    }
}
