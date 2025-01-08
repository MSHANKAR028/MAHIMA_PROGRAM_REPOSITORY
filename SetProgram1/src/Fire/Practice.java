package Fire;
import java.util.*;
public class Practice {
    public static boolean wordPattern(String pattern, String s) {
        // Split the string into words
        String[] words = s.split(" ");

        // Check if lengths of pattern and words array match
        if (pattern.length() != words.length) {
            return false;
        }

        // Two hash maps to maintain bijection
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check character-to-word mapping
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // Mismatch
                }
            } else {
                charToWord.put(c, word);
            }

            // Check word-to-character mapping
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false; // Mismatch
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example 1
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(wordPattern(pattern1, s1)); // Output: true

        // Example 2
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern2, s2)); // Output: false

        // Example 3
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(wordPattern(pattern3, s3)); // Output: false
    }

































}
