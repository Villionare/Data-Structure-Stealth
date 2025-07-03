package Process.LinkedList.ReverseList_Recursion;

class LinkedList {
    Node head;

    // Recursive method to reverse the list
//    Node reverse(Node current) {
//        if (current == null || current.next == null) {
//            return current;
//        }
//        Node newHead = reverse(current.next);
//        current.next.next = current;
//        current.next = null;
//        return newHead;
//    }
//
//    void reverseList() {
//        head = reverse(head);
//    }

    void reverse(Node head, LinkedList reversedLinkedList){
        if (head == null){
            return;
        } else {
            reverse(head.next, reversedLinkedList);

            reversedLinkedList.append(head.data);
        }
    }

    // Utility method to insert a node at the end
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Utility method to print the list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Original List:");
        list.printList();

        list.reverseList();

        System.out.println("Reversed List:");
        list.printList();
    }
}

