package Process.LinkedList.ReverseList_Recursion;

class LinkedList {
    Node head;


    void reverse(){
        Node prev;
        Node forward;
        Node current;
        Node n = head;

        while (n.next!=null){
            current = head.next;
            forward = current.next;
            prev = head;

            current.next = prev;
            prev = current;
            forward = forward.next;
            current = forward;
            n = n.next;
        }

    }

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

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

