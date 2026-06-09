package NQT.Questions;

public class CheckPalindrome34 {

    static void main() {
        System.out.println("This is program to palindrome: ");

        String word = "Malayalam";
        String check = word.trim().toLowerCase();

        int length = check.length();

        boolean pali = true;
        int left = 0;
        int right = length-1;

        if (word == null || word.isEmpty()){

            System.out.println("Not a Palindrome");

        }else {

        while (left<right){

            if (check.charAt(left) != check.charAt(right)){
                pali = false;
                break;
            }

            left++;
            right--;
            pali = true;
        }

        System.out.println(pali?"palindrome" : "Not a palindrome");
    }
}
}
