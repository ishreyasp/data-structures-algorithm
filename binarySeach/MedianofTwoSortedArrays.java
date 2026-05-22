/**
You are given two integer arrays nums1 and nums2 of size m and n respectively, where each is sorted in ascending order. 
Return the median value among all elements of the two arrays.

Your solution must run in O(log(m+n)) time.

Example 1:
Input: nums1 = [1,2], nums2 = [3]
Output: 2.0
Explanation: Among [1, 2, 3] the median is 2.

Example 2:
Input: nums1 = [1,3], nums2 = [2,4]
Output: 2.5
Explanation: Among [1, 2, 3, 4] the median is (2 + 3) / 2 = 2.5.
 */
class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int l = 0;
        int r = n1;

        while(l <= r) {
            int cut1 = (l + r) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            if(left1 <= right2 && left2 <= right1) {
                if((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if(left1 > right2) {
                r = cut1 - 1;
            } else {
                l = cut1 + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        MedianofTwoSortedArrays medianFinder = new MedianofTwoSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = medianFinder.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median); // Output: Median: 2.0
    }
}
