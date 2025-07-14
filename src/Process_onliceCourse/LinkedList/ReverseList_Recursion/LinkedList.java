package Process_onliceCourse.LinkedList.ReverseList_Recursion;

class LinkedList {
    Node head;

    void reverse(){
        Node prev = null;
        Node temp = head;

        while (temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev; //last wala ye element head me stored reh jaaega par link nahi ho paaega isiliye ise manually hamne head banaya hai.
    }

    //now solving the the problem using Recursion.
//    void reverse(Node head){
//        if(head.next == null || head == null){ //base case
//            return head;
//        } else {
//            //head (1)
//            //head.next = prev; (2)
//            //head.nxt.nxt = node;
//
//        }
//    }

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

