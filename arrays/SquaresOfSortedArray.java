/**
You are given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int j = nums.length - 1;
        int i = 0;
        int pos = j;
        while(i <= j) {
            int sqrLeft = nums[i] * nums[i];
            int sqrRight = nums[j] * nums[j];

            if(sqrLeft < sqrRight) {
                res[pos] = sqrRight;
                j--;
            } else {
                res[pos] = sqrLeft;
                i++;
            }
            pos--;
        }

        return res;
    }
    
    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] res = squaresOfSortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for(int i : res) {
            System.out.print(i + " ");
        }
    }
}
