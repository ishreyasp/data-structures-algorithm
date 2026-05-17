import java.util.ArrayList;
import java.util.List;

/**
You are given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in nums.

Note: You can return the integers in any order.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 */
class NumbersDisapperedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int num : nums) {
            int i = Math.abs(num) - 1;
            nums[i] = -Math.abs(nums[i]);
        }

        List<Integer> res = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NumbersDisapperedInArray obj = new NumbersDisapperedInArray();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(obj.findDisappearedNumbers(nums));
    }
}
