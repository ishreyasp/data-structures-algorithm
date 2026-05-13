/**
You are given two strings, word1 and word2. Construct a new string by merging them in alternating order, 
starting with word1 — take one character from word1, then one from word2, and repeat this process.

If one string is longer than the other, append the remaining characters from the longer string to the end of the merged result.

Return the final merged string.

Example 1:
Input: word1 = "abc", word2 = "xyz"
Output: "axbycz"

Example 2:
Input: word1 = "ab", word2 = "abbxxc"
Output: "aabbbxxc"
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j));
                j++;
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately solution = new MergeStringsAlternately();

        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqcr"

        String word3 = "ab";
        String word4 = "pqrs";
        System.out.println(solution.mergeAlternately(word3, word4)); // Output: "apbqrs"

        String word5 = "abcd";
        String word6 = "pq";
        System.out.println(solution.mergeAlternately(word5, word6)); // Output: "apbqcd"
    }
}
