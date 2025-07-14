package Process_onliceCourse.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private Node temp;

    public Node getTail() {
        return tail;
    }

    public Node getTemp() {
        return temp;
    }

    //setter functions
    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    void add(String data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = node;
            this.tail = node;

        } else {
            Node n = head;

            while(n.getNext() != null){
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    Node findNode(String data){
        Node n =  this.head;

        while (n.getNext() != null){
            if(n.getData().equals(data)){
                return n;
            }
            n.setNext(n.getNext());
        }
        return null;
    }

    //inserting an element
    void insert(String data, String dataBefore) {

        Node insertingNode = new Node(data);

        if(this.head == null){
            this.head = this.tail = insertingNode;
        } else {

            //finding the node after which the data has to be inserted
            Node nodeBefore = findNode(dataBefore);

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

    void delete(String data){
        Node n = this.head;
        Node nodeBefore; //experiment ke liye tail dala hai

        // Pehle us node ko dhoondo jisme yeh data ho.
        temp = findNode(data);

        if(temp != null){

            // Agar delete karne waala node head node hai, to head ko uske next node par shift kar do.
            if(temp == head){
                head = head.getNext();

                if(temp == tail){
                    tail = null;
                }

            } else {

                //Us node tak traverse karo jo delete hone waale node se just pehle aata hai, usse nodeBefore keh lo.
                while(n.getNext() != temp){
                    n = n.getNext();
                }
                    nodeBefore = n;

                // nodeBefore ka link update karo, taaki woh delete hone waale node ke next node ki taraf point kare.
                nodeBefore.setNext(temp.getNext());

                // Agar delete hone waala node tail node hai, to nodeBefore ko tail bana do.
                if(temp == tail){
                    nodeBefore = tail;
                }
                //Aur delete hone waale node ka link null kar do (memory clean-up ke liye).
                temp = null;
            }

        } else {
            System.out.println("not found");
        }
    }

    void addAtBeginning(String data){

        Node newNode = new Node(data);

        if(this.head == null){
            this.head = newNode;
        } else {
            this.temp = this.head;
            this.head = newNode;
            head.setNext(this.temp);
        }
    }

    void show() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}