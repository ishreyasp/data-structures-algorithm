/**
Given a string s, find the length of the longest substring without duplicate characters.

A substring is a contiguous sequence of characters within a string.

Example 1:
Input: s = "zxyzxyz"
Output: 3
Explanation: The string "xyz" is the longest without duplicate characters.
 */
import java.util.HashSet;
import java.util.Set;

class LongSubstringNoRepeatChars {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int index = 0;

        for(int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(index));
                index++;
            }

            set.add(s.charAt(i));
            count = Math.max(count, i - index + 1);
        }
        return count;
    }    

    public static void main(String[] args) {
        LongSubstringNoRepeatChars solution = new LongSubstringNoRepeatChars();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
