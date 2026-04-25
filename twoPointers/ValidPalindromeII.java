/**
You are given a string s, return true if the s can be a palindrome after deleting at most one character from it.

A palindrome is a string that reads the same forward and backward.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:
Input: s = "aca"
Output: true
Explanation: "aca" is already a palindrome.

Example 2:
Input: s = "abbadc"
Output: false
Explanation: "abbadc" is not a palindrome and can't be made a palindrome after deleting at most one character.

Example 3:
Input: s = "abbda"
Output: true
Explanation: "We can delete the character 'd'.
 */
class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int l = 0; 
        int r = s.length() - 1;

        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l, r - 1) || isPalindrome(s, l + 1, r);
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeII solution = new ValidPalindromeII();
        String s = "abca";
        boolean result = solution.validPalindrome(s);
        System.out.println(result); 
    }
}
