/**
You are given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string 
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "node", t = "neetcode"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */
class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sPtr = 0;
        int tPtr = 0;

        while(tPtr < t.length() && sPtr < s.length()) {
            if(s.charAt(sPtr) == t.charAt(tPtr)) {
                sPtr++;
            } 
            tPtr++;
        }

        if(sPtr == s.length()) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        IsSubsequence subsequenceChecker = new IsSubsequence();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = subsequenceChecker.isSubsequence(s, t);
        System.out.println(result); // Output: true
    }
}
