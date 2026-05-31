/**
You are given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
 */
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int maxLen = 0;

        for(int r = 0; r < nums.length; r++) {
            if(nums[r] == 0) {
                l = r + 1;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }    

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
}
