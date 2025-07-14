package Process_onliceCourse.LinkedList;

public class Main {
    
    public static void main(String[] args) {
    
        LinkedList list = new LinkedList();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");
        list.add("seventh");

        list.insert("fourth", "rusya");

        list.delete("fourth");
        list.delete("rusyaaaa");

        list.addAtBeginning("this");
        list.addAtBeginning("is");
        list.addAtBeginning("a");
        list.addAtBeginning("Linked");
        list.addAtBeginning("List");

        list.show();
    }
}