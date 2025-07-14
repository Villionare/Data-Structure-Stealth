package Process_onliceCourse.Queue.Practise;

class Tester {

    public static void main(String[] args) {

        Queue queue = new Queue(7);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(10);

        Queue[] queueArray = splitQueue(queue);

        System.out.println("Elements in the queue of odd numbers");
        queueArray[0].display();

        System.out.println("\nElements in the queue of even numbers");
        queueArray[1].display();
    }

    public static Queue[] splitQueue(Queue queue) {
        //Implement your code here and change the return value accordingly
        Queue oddQueue = new Queue(10);  // for odd numbers
        Queue evenQueue = new Queue(10);

        for(int i = 0; i <= (queue.getMaxSize()-1); i++){
        int element = queue.dequeue();
        int check = queue.dequeue()%2;
            if(check == 0){
                evenQueue.enqueue(element);
            } else {
                oddQueue.enqueue(element);
            }
        }
        Queue[] result = new Queue[2];
        result[0] = oddQueue;  // index 0 holds odd numbers
        result[1] = evenQueue;
        return result;
    }
}