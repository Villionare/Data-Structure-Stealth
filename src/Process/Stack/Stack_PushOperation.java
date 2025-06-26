package Process.Stack;

public class Stack_PushOperation {
//    Check whether the stack is full.
//    If the stack is full, return false
//    If the stack is not full,
//    Increment top by 1
//    Add the element at top position in the elements array
//    Return true

    private int top;
    private int maxSize;
    private int[] arr;

    Stack_PushOperation(int maxSize){
        this.top = -1; //top should be -1 when the stack is created
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    //checking if the stack is full or not
    boolean isFull(){
        if (top == maxSize - 1){
            return true;
        }
        return false;
    }

    //adding new element on the top of the stack
    boolean push(int element){
        if (isFull()){
            return false;
        } else {
            arr[++top] = element;
            return true;
        }
    }

    void display(){
        for (int i: arr){
            System.out.print(i + " ");
        }
    }

    //peek operation - is the process of displaying only the top element of the stack
    int peek(){
        if(top < 0 ){
            System.out.println("Stack is empty.");
        } else {
            return arr[top];
        }
        return 0;
    }

    boolean isEmpty(){
        return top < 0;
    }

    //pop operation - the process of removing only the top element
//    Check whether the stack is empty.
//    If the stack is empty, return appropriate message
//    If the stack is not empty,
//    Retrieve data at the top of the stack
//    Decrement top by 1
//    Return the retrieved element
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        } else {
            return arr[top--]; //will return the top then will -- the top
        }
    }
}
