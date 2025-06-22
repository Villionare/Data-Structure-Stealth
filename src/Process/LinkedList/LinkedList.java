package Process.LinkedList;

public class LinkedList {
    Node head;

    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.reference != null){
                current = current.reference;
            }

            current.reference = newNode;
        }
    }

    void show(){
        Node n = head;
        while (n.reference != null){

            System.out.print(n.data + " -> ");
            n = n.reference;

        }
        System.out.println("reference = null, but data is:" + n.data);
    }
}