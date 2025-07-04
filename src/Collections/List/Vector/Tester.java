package Collections.List.Vector;

import java.util.Vector;

public class Tester {

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




    }
}
