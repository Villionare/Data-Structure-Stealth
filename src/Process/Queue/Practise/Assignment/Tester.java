package Process.Queue.Practise.Assignment;


import java.util.Collections.*;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        Queue queue = new Queue(7);
        queue.enqueue(13983);
        queue.enqueue(10080);
        queue.enqueue(7113);
        queue.enqueue(2520);
        queue.enqueue(2500);

        Queue outputQueue = findEvenlyDivisibleNumbers(queue);

        System.out.println("Evenly divisible nobers");
        outputQueue.display();

    }

    public static Queue findEvenlyDivisibleNumbers(Queue queue) {
        //Implement your code here and change the return value accordingly

        Queue newQ = new Queue(queue.getMaxSize());

        for (int i = 0; i <= queue.getMaxSize(); i++){
            
            int no = queue.dequeue();
            
            if(no >= 0){
                if (no%10 == 0){
                    if (no%9 == 0){
                        if (no%8 == 0){
                            if (no%7 == 0){
                                if (no%6 == 0){
                                    if (no%5 == 0){
                                        if (no%4 == 0){
                                            if (no%3 == 0){
                                                if (no%2 == 0){
                                                    if (no%1 == 0){
                                                        newQ.enqueue(no);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return newQ;
    }
}
