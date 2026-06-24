package NQT.Questions.Exercises;

public class MyClass{
    public static void main(String[] args){
//this program is to check weather a number is strong number or not

        int no = 147;
        int check = no;
        int sum = 0;

        while(no>0){
            int last = no%10;
            sum += factorial(last);
            no /= 10;
        }

        if(check == sum){
            System.out.println("Strong");
        }else{
            System.out.println("not");
        }
    }

    private static int factorial(int no){
        int fact = 1;
        for(int i=no; i>=1; i--){
            fact *= i;
        }
        return fact;
    }
}