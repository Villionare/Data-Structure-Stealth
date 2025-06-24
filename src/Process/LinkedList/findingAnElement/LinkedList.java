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

    //function to delete a node
    void delete(String data){
        Node n = head;
        Node nodeBefore = tail; //experiment ke liye tail dala hai

        // Pehle us node ko dhoondo jisme yeh data ho.
        Node temp = findNode(data);

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
                    nodeBefore = n;
                    n = n.getNext();
                }

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

    void show() {
        Node n = getHead();
        while (n != null) {
            System.out.print(n.getData() + " -> ");
            n = n.getNext();
        }
        System.out.println("null");
    }
}
