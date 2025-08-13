package com.DsaPlaylist.Assignments;

public class LeetCode_1832 {
        public static boolean checkIfPangram(String sentence) {
            int len = sentence.length();
            char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                    'n','o','p','q','r','s','t','u','v','w','x','y','z'
            };

            boolean[] check = new boolean[26];

            for(char c = 'a'; c<='z'; c++){
                    if(sentence.indexOf(c) == -1){
                        return false;
                    }
            }
            return true;
        }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    }
