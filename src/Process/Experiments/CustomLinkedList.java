package Process.Experiments;

class CustomLinkedList {
    Node head;  // list ka starting point

    // Node add karne ka method
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;  // agar list khaali hai
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // last node tak jao
            }
            current.next = newNode;  // last node ke baad naya node jodo
        }
    }

    // List print karne ka method
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}