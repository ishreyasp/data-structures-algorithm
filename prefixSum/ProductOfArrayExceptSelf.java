/**
Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

Follow-up: Could you solve it in 
O(n) time without using the division operation?

Example 1:
Input: nums = [1,2,4,6]
Output: [48,24,12,8]

Example 2:
Input: nums = [-1,0,1,2,3]
Output: [0,-6,0,0,0]
 */
class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for(int i = 1; i < n; i++) { 
            res[i] = res[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i]; 
        }
        return res;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}