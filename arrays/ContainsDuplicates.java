import java.util.HashSet;
import java.util.Set;

/**
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
 */
class ContainsDuplicates {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num : nums) {
            if(!mySet.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(cd.hasDuplicate(nums1)); 
        System.out.println(cd.hasDuplicate(nums2));
    }
}