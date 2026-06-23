package NQT.Questions;

public class ReverseWordsInSentence49 {
    static void main() {
        String string = "The Quick Brown Fox Jumps Over The Lazy Dog";

        String[] arr = string.split(" ");

        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}