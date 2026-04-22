/**
You are given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
 */
class NextPermutaion {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if(i >= 0) {
            int j = n - 1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args) {
        NextPermutaion nextPermutaion = new NextPermutaion();
        int[] nums = new int[]{1, 2, 3};
        nextPermutaion.nextPermutation(nums);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
}
