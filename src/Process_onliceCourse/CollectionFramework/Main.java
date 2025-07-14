package Process_onliceCourse.CollectionFramework;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 43, 6, 76, 65, 3, 5, 7 };

        Iterator<Integer> iterator = Arrays.stream(arr).iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
