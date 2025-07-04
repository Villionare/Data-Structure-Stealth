package Collections.List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Tester{


    public static void main(String[] args) {
        //is is just like arrayList, stores elements in continues dynamic array
        //vector is synchronized
        //vector is thread safe
        //vector is a legacy class, means it was there before the collections framework (i.e. java 1)
        //when using only single thread it is not preferred to use Vectors, use ArrayLists

        Vector<String> v1 = new Vector<>(5,1);

        v1.add("heyo");
        v1.add("heyo");
        v1.add("heyo");
        v1.add("heyo");
        v1.add("heyo");
        v1.add("heyo");

        System.out.println(v1);
        System.out.println(v1.capacity());

        Vector<Integer> newVector = new Vector<>();
        //in the case of Vector which is thread safe and it stores from one thread at a time

        //ArrayList<Integer> newVector = new ArrayList<>();
        //ArrayList is not Synchronized i.e. not thread safe
        // while using arrayList you will notice that after inserting the elements concurrently
        //the size is changing everytime due to the 2 threads working concurrently

        Thread Thread1 = new Thread(()->{
            for (int i = 1; i <= 1000; i++){
                newVector.add(i);
            }
        });

        Thread Thread2 = new Thread(()->{
            for (int i = 1; i <= 1000; i++){
                newVector.add(i);
            }
        });

        Thread1.start();
        Thread2.start();

        try{
            Thread1.join();
            Thread2.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println(newVector.size());
    }


}
