package p1768_mergeStringAlternately;

/*
    Each time you use the += operator on a String object you're creating a new String in the background,
    because Strings are immutable once created. Instead, use a StringBuilder because it is mutable.
    If you need thread safety, use StringBuffer instead.
 */
public class SolutionOptimize {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();

        if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                output.append(word1.charAt(i)).append(word2.charAt(i));
            }
            output.append(word2.substring(word1.length(), word2.length()));
        }
        if (word2.length() < word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                output.append(word1.charAt(i)).append(word2.charAt(i));
            }
            output.append(word1.substring(word2.length(), word1.length()));
        }

        if (word2.length() == word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                output.append(word1.charAt(i)).append(word2.charAt(i));
            }
        }

        return output.toString();

    }
}
