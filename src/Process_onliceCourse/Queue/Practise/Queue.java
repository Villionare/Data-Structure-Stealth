package Process_onliceCourse.Queue.Practise;

class Queue {

    private int front;
    private int rear;
    private final int maxSize;
    private final int[] arr;

    public int[] getArr() {
        return arr;
    }

    Queue(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new int[this.maxSize];
    }

    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            return false;
        } else {
            arr[++rear] = data;
            return true;
        }
    }

    public void display() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else {
            for (int index = front; index <= rear; index++) {
                System.out.println(arr[index]);
            }
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = arr[this.front];
            arr[front++] = Integer.MIN_VALUE;
            return data;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }
}
