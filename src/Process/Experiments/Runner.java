package Process.Experiments;

public class Runner {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();  // Output: 10 -> 20 -> 30 -> null
    }
}