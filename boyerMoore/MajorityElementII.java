import java.util.ArrayList;
import java.util.List;

/**
You are given an integer array nums of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
You can return the result in any order.

Example 1:
Input: nums = [5,2,3,2,2,2,2,5,5,5]
Output: [2,5]

Example 2:
Input: nums = [4,4,4,4,4]
Output: [4]

Example 3:
Input: nums = [1,2,3]
Output: []
 */
class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList();
        int n = nums.length / 3;
        Integer candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for(int num : nums) {
            if(candidate1 != null && num == candidate1) {
                count1++;
            } else if(candidate2 != null && num == candidate2) {
                count2++;
            } else if(count1 == 0) {
                candidate1 = num;
                count1++;
            } else if(count2 == 0) {
                candidate2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : nums) {
            if(num == candidate1) {
                count1++;
            } else if(num == candidate2) {
                count2++;
            }
        }

        if(count1 > n) {
            list.add(candidate1);
        }

        if(count2 > n) {
            list.add(candidate2);
        }
        
        return list;
    }

    public static void main(String[] args) {
        MajorityElementII solution = new MajorityElementII();
        int[] nums = {5, 2, 3, 2, 2, 2, 2, 5, 5, 5};
        List<Integer> result = solution.majorityElement(nums);
        System.out.println("The majority elements are: " + result);
    }
}
