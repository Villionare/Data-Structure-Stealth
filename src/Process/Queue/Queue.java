package Process.Queue;

public class Queue {
    private int front;
    private int rear;
    private int maxSize;
    private String[] arr;

    Queue(int maxSize){
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        arr = new String[maxSize];
    }

    boolean isFull(){
    return this.rear == maxSize - 1;
    }

    //enqueue operation - this operation is used to add an element in the rear of the stack
    boolean enQueue(String data){
        if(isFull()){
            return false;
        } else {
            arr[++rear] = data;
            return true;
        }
    }

    //displaying the elements of a queue
    void display(){
        for (String i: arr){
            System.out.print(i + " ");
        }
    }

    
}
