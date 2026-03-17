/**
You are given an integer array nums of length n. 
Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1:
Input: nums = [1,4,1,2]
Output: [1,4,1,2,1,4,1,2]

Example 2:
Input: nums = [22,21,20,1]
Output: [22,21,20,1,22,21,20,1]
 */

public class ConcatArray {

    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[2 * len];

        for(int i=0; i<len; i++) {
            result[i] = result[i+len] = nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        ConcatArray ca = new ConcatArray();
        int[] nums = {1,4,1,2};
        int[] result = ca.getConcatenation(nums);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}