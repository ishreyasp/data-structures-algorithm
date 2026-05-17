import java.util.HashMap;
import java.util.Map;

/**
You are given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [2,-1,1,2], k = 2
Output: 4
Explanation: [2], [2,-1,1], [-1,1,2], [2] are the subarrays whose sum is equals to k.
 */
class SubarraySUmEqualsK {
    public int subarraySum(int[] nums, int k) {
        int res = 0, curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            curSum += num;
            int diff = curSum - k;
            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        SubarraySUmEqualsK solution = new SubarraySUmEqualsK();
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(solution.subarraySum(nums, k)); // Output: 2
    }
}
