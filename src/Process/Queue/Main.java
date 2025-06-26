package Process.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        if (queue.enQueue("this")){
            System.out.println("added to queue");
        }else {
            System.out.println("queue is full");
        }
        if (queue.enQueue("is")){
            System.out.println("added to queue");
        }else {
            System.out.println("queue is full");
        }
        if (queue.enQueue("a")){
            System.out.println("added to queue");
        }else {
            System.out.println("queue is full");
        }
        if (queue.enQueue("queue")){
            System.out.println("added to queue");
        }else {
            System.out.println("queue is full");
        }
        if (queue.enQueue("by")){
            System.out.println("added to queue");
        }else {
            System.out.println("queue is full");
        }
        if (queue.enQueue("meeee")){
            System.out.println("added to queue");
        }else {
            System.out.println("queue is full");
        }

    }
}
