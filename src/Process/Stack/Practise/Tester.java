package Process.Stack.Practise;

class Tester {

    public static void main(String args[]) {

        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        calculateSum(stack);

        System.out.println("Updated stack");
        stack.display();
    }

    public static void calculateSum(Stack stack) {

        int[] element =  new int[stack.getMaxSize()];
        int sum = 0;

        Stack temp = new Stack(stack.getMaxSize());
        int iterator = 0;

        while (iterator != stack.getMaxSize()){
            int pop = stack.pop();

            if(pop >= 0){
                temp.push(pop);
            }
                sum += pop;
                iterator++;
        }

        stack.push(sum);

        iterator = 0;

        while (iterator != stack.getMaxSize()){
            int pop = temp.pop();
            if (pop >= 0){
               stack.push(pop);
            }
               iterator++;
        }
    }

    //Ai generated solution:

//    public static void calculateSum(Stack stack) {
//        Stack tempStack = new Stack(10);
//        int sum = 0;
//
//        // Step 1: Pop from original and add to sum, store in temp
//        while (!stack.isEmpty()) {
//            int val = stack.pop();
//            sum += val;
//            tempStack.push(val);
//        }
//
//        // Step 2: Push sum first (this becomes the bottom)
//        stack.push(sum);
//
//        // Step 3: Restore original elements on top of the sum
//        while (!tempStack.isEmpty()) {
//            stack.push(tempStack.pop());
//        }
//    }
}