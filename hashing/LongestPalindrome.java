import java.util.HashMap;
import java.util.Map;

/**
You are given a string s which consists of lowercase or uppercase letters, 
return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap();
        int res = 0;

        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
            if(count.get(c) % 2 == 0) {
                res += 2;
            }
        }

        return res + (res < s.length() ? 1 : 0);
    }

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        String s = "abccccdd";
        System.out.println(solution.longestPalindrome(s)); // Output: 7
    }
}
