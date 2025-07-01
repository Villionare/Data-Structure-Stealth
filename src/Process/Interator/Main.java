package Process.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);

        Iterator<Integer> i = a.iterator();

        List<String> list = new ArrayList<String>();
        list.add("Pizza");
        list.add("Pizza");
        list.add(0, "Burger");
        list.add(0, "Sandwich");
        list.add(0, "Noodles");
        System.out.println(list.size());

        Iterator<String> j = list.iterator();
        System.out.println(j.hashCode());
    }
}
