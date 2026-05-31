/**
You are given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
 */
class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }    

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
}
