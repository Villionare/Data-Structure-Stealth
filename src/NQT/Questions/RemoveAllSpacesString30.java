package NQT.Questions;

public class RemoveAllSpacesString30 {

    static void main() {
        String str = "The Quick Brown Fox Jumps Over The Lazy Dog";

//        String noSpace = str.replace(" ", "");

        String noSpace = str.replaceAll("\\s+", "");

        System.out.println(noSpace);
    }
}
