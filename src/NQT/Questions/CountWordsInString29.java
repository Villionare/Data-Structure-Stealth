package NQT.Questions;

import java.util.Arrays;

public class CountWordsInString29 {
    static void main() {

        String str = "The Quick Brown Fox Jumps Over The Lazy Dog";

// This can be solved using the regex "\\s+"
//
// "\\s" means any whitespace character:
// - space (' ')
// - tab (\t)
// - newline (\n)
// etc.
//
// "+" means one or more occurrences.
//
// So it matches:
// " "
// "     "
// "\t"
// "\n"
// or any combination of whitespace characters.
//
// trim() removes leading and trailing whitespace.
// split("\\s+") then splits the string wherever one or more
// whitespace characters occur.

        String[] words = str.trim().split("\\s+");

        System.out.println(Arrays.toString(words));
    }
}

//this sol works limited for assuming that all the words are separated by just one space " "

//        System.out.println("This is to calculate the no of words in a string: ");
//        int spaces = 0;
//        for (int s=0; s<str.length(); s++){
//            if(str.charAt(s) == ' '){
//                spaces++;
//            }
//        }
//        spaces++;
//        System.out.println("There are total " + spaces + " words in the String");
