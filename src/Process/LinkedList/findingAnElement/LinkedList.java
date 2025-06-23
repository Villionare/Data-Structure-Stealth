package Process.LinkedList.findingAnElement;

public class LinkedList {
    private Node head;
    private Node tail;
    private Node temp;

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public Node getTemp() {
        return temp;
    }

    void add(String data){
        Node insertingNode = new Node(data);

        if(getHead() == null){
            setHead(insertingNode);
        } else {
            setTemp(getHead());
            setHead(insertingNode);
            insertingNode.setNext(getTemp());
        }
    }


    String findingNode(String data){
        Node c = getHead();
        int count = 0;

        while (c != null) {
            if(c.getData().equalsIgnoreCase(data)){
            return data;
            }
            c = c.getNext();
        }
    return null;
    }

    Node findNode(String data){
        Node temp = head;

        while (temp != null){
            if(temp.getData().equals(data)){
                return temp;
            }

            temp = temp.getNext();
        }
        return null;
    }

    //inserting an element
    void insert(String data, String dataBefore) {

        Node insertingNode = new Node(data);

        if(getHead() == null){
            this.head = this.tail = insertingNode;
        } else {

        //finding the node after which the data has to be inserted
        Node nodeBefore = this.findNode(dataBefore);

        if(nodeBefore != null){
            insertingNode.setNext(nodeBefore.getNext());
            nodeBefore.setNext(insertingNode);

            if(nodeBefore == this.tail)
                this.tail = insertingNode;

            } else {
                System.out.println("Not Found!");
            }
        }
    }

    void show() {
        Node n = getHead();
        while (n != null) {
            System.out.print(n.getData() + " -> ");
            n = n.getNext();
        }
        System.out.println("null");
    }
}
