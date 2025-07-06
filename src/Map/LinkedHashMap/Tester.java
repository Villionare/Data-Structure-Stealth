package Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Student {
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

}

public class Tester {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "lucky");
        lhm.put(2, "chugh");
        lhm.put(3, "denom");
        lhm.put(4, "shelly");

        System.out.println(lhm);
        Set<Integer> setk = lhm.keySet();

        for (Integer item: setk){
            System.out.println(lhm.get(item));
        }

        Student s1 = new Student("ajay", 60);
        Student s2 = new Student("ritkk", 66);
        Student s3 = new Student("sohail", 44);

        Map<Student, Integer> student = new HashMap<>();

        student.put(s1, 24);
        student.put(s2, 29);
        student.put(s3, 30);

        System.out.println(student);
    }
}
