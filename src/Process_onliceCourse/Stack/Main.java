package Process_onliceCourse.Stack;

public class Main {
    public static void main(String[] args) {
        Stack_PushOperation stack1 = new Stack_PushOperation(5);
        System.out.println("Stack is created with the size of 5");

        if (stack1.push(1)){
            System.out.println("successfully added 1 at index[1] in the stack");
        } else {
            System.out.println("stack is full");
        }
        if (stack1.push(2)){
            System.out.println("successfully added 1 at index[1] in the stack");
        } else {
            System.out.println("stack is full");
        }
        if (stack1.push(3)){
            System.out.println("successfully added 1 at index[1] in the stack");
        } else {
            System.out.println("stack is full");
        }
        if (stack1.push(4)){
            System.out.println("successfully added 1 at index[1] in the stack");
        } else {
            System.out.println("stack is full");
        }
        if (stack1.push(5)){
            System.out.println("successfully added 1 at index[1] in the stack");
        } else {
            System.out.println("stack is full");
        }
        if (stack1.push(6)){
            System.out.println("successfully added 1 at index[1] in the stack");
        } else {
            System.out.println("stack is full");
        }

        stack1.display();
        stack1.pop();
        System.out.println();
        stack1.display();
    }
}
