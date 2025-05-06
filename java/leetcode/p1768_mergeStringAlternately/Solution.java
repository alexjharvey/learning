package p1768_mergeStringAlternately;
/*
    Strings are immutable in Java so we can't just pop the chars out of the string. However,
    we can use the built-in charAt method to get the char value and then convert this value
    to a String.

 */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output="";

        if(word1.length()<word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                output += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
                System.out.println(output);
            }
            output+=word2.substring(word1.length(), word2.length());
        }
        if(word2.length()<word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                output += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
            }
            output+=word1.substring(word2.length(), word1.length());
        }

        if(word2.length()==word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                output += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
            }
        }

        return output;

    }
}
