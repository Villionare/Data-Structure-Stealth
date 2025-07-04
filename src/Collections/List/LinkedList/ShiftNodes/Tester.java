package Collections.List.LinkedList.ShiftNodes;

class Tester {

    public static void main(String args[]) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addAtEnd("ABC");
        linkedList1.addAtEnd("DFG");
        linkedList1.addAtEnd("XYZ");
        linkedList1.addAtEnd("EFG");

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAtEnd("ABC");
        linkedList2.addAtEnd("DFG");
        linkedList2.addAtEnd("XYZ");
        linkedList2.addAtEnd("EFG");

        System.out.println("Initial List");
        linkedList1.display();

        System.out.println("\nList after left shifting by 2 positions");
        shiftListLeft(linkedList1, 2);
        linkedList1.display();

        System.out.println("\nInitial List");
        linkedList2.display();

        System.out.println("\nList after right shifting by 2 positions");
        shiftListRight(linkedList2, 3);
        linkedList2.display();
    }

    public static void shiftListLeft(LinkedList linkedList, int n) {
        int count = 1;

        if(n == 0 || linkedList == null || linkedList.getHead() == linkedList.getTail()){
            return;
        } else {
            Node j = linkedList.getHead();

            while (j.getNext() != null){
                j = j.getNext();
                count++;
            }
//            System.out.println(count);

            n = n % count;
            if (n == 0) return;

            if(n>=count){
                System.out.println("n must be smaller than the total no of nodes");
            }else {
                 Node head = linkedList.getHead();
                 Node tail = linkedList.getTail();

                 Node newHead;
                 Node newTail;

                 int i = 1;
                 Node tempHead = linkedList.getHead();
                 while (i < n){
                     tempHead = tempHead.getNext();
                     i++;
                 }

                 newTail = tempHead;
                 newHead = tempHead.getNext();

                 linkedList.setHead(newHead);
                 tail.setNext(head);
                 linkedList.setTail(newTail);
                 newTail.setNext(null);
                 linkedList.setTail(newHead);

            }
        }
    }

    public static void shiftListRight(LinkedList linkedList, int n) {
        int i = 1;
        Node iterate = linkedList.getHead();

        while(iterate.getNext()!=null){
            i++;
            iterate = iterate.getNext();
        }

        int finalNodes =  i - n;

        shiftListLeft(linkedList, finalNodes);
    }
}

