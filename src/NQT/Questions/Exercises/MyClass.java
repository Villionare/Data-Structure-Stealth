package NQT.Questions.Exercises;

public class MyClass{
    public static void main(String[] args){
        //to convert a binary no into decimal multiply digits from right to increasing 2 power increasing order:


        int binary = 1101;
        int decimal = 0;
        int power = 0;

        while(binary>0){

            int last = binary%10;

            decimal += (int) (last*Math.pow(2, power++));

            binary /= 10;
        }

        System.out.println(decimal);
    }
}