package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {

        //Hashmap - !Synchronized = !thread-safe

        //Basic components of Hashmap:
        //- Key
        //- Value

        //- Bucket: - Internally, a HashMap uses an array called a bucket array to store entries.
        //            Each index in this array corresponds to a bucket, which can contain one or more entries (via linked lists or balanced trees).

        //- Hash Function: - Converts a key into an integer (hash code).
        //                   That hash code is then mapped to a bucket index using a modulus operation (hash % array.length).

        Map<Integer, String> hash1 = new HashMap<>();
        hash1.put(1, "abhay");
        hash1.put(2, "abhishek");
        hash1.put(3, "aditya");
        hash1.put(null, "this is a null value");

        System.out.println(hash1);

        String value = hash1.get(3);
        System.out.println(value);

        System.out.println(hash1.containsValue("yo"));;
        System.out.println(hash1.containsKey(56));;

        //to loop through the map use set, it's a basic set like in mathematics
        //this set will store all the key of the maps
        //so then we can iterate through each of them:
        Set<Integer> mapset = hash1.keySet();

        for (Integer K_V: mapset){
            System.out.println(K_V +" - "+ hash1.get(K_V));
        }

        //another method to loop through HashMap:
        Set<Map.Entry<Integer, String>> another = hash1.entrySet();
        System.out.println(hash1.keySet());

        for (Map.Entry<Integer, String> item : another){
            System.out.println(item.getClass()+" - "+ item.getKey() + " : "+ item.getValue());
        }

        hash1.remove(null);
        System.out.println(hash1);

    }
}
