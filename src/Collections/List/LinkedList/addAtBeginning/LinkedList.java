package Collections.List.LinkedList.addAtBeginning;

public class LinkedList {
    private Node head;
    private Node first;

    public Node getFirst() {
        return first;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    void addAtBeginning(String data){

        Node newNode = new Node(data);

        if(this.head == null){
            this.head = newNode;
        } else {
            this.first = this.head;
            this.head = newNode;
          head.setNext(this.first);
        }
    }

    void show(){
        Node n = head;
        while(n.getNext() != null){
            System.out.println(n.getData());
            n = n.getNext();
        }
        System.out.println(n.getData());
    }
}
