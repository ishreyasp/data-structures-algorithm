/**
Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. 
The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [2,20,4,10,3,4,5]
Output: 4
 */
import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currNum = num;
                int count = 1;

                while(set.contains(currNum + 1)) {
                    currNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        LongestConsecutiveSeq sol = new LongestConsecutiveSeq();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(sol.longestConsecutive(nums));
    }
}
