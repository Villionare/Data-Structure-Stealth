package com.DsaPlaylist.Assignments;

public class ReverseString {
        public static void main(String[] args) {
            String str = "Hello World";

            // Convert to char array for in-place reversal
            char[] chars = str.toCharArray();
            int start = 0;
            int end = chars.length - 1;

            while (start < end) {
                // Swap
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }

            String reversed = new String(chars);
            System.out.println("Reversed String: " + reversed);
        }
}
