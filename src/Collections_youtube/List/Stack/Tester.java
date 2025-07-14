package Collections_youtube.List.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Tester {

    //LIFO
    //stacks extends to Vectors
    //they have the same properties as Vectors
    //only one thread can access a Stack at a time
    //elements are stored in an dynamic array

    public static void main(String[] args) {
        System.out.println("Stacks:");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(2);
        stack1.push(2);
        stack1.push(2);

        System.out.println(stack1.peek());
        System.out.println(stack1.capacity());
        System.out.println(stack1);

        //we can use linked list as stacks
        System.out.println("LinkedList:");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println(ll.getLast());; //peek
        ll.removeLast(); //pop
        ll.set(2, 9); //set
        System.out.println(ll);


        //arrayList as Stack
        System.out.println("ArrayList:");
        ArrayList<Integer> al = new ArrayList<>();
        al.addLast(5);
        al.addLast(6);
        al.addLast(7);
        al.addLast(8);
        al.addLast(9);
        al.addLast(10);

        System.out.println(al.getLast());
        al.removeLast();

        System.out.println(al);

    }
}
