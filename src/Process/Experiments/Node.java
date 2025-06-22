package Process.Experiments;

class Node {
    int data;       // value store karega
    Node next;      // agle node ka reference

    Node(int data) {
        this.data = data;
        this.next = null;  // shuru mein next kuch nahi
    }
}