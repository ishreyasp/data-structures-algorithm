/**
You are given an array of non-negative integers height which represent an elevation map. Each value height[i] represents the height of a bar, which has a width of 1.

Return the maximum area of water that can be trapped between the bars.

Example 1:
Input: height = [0,2,0,3,1,0,1,3,2,1]
Output: 9
 */
class TrappingRainWater {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int lmax = height[l];
        int rmax = height[r];
        int water = 0;

        while(l < r) {
            if(lmax < rmax) {
                l++;
                lmax = Math.max(lmax, height[l]);
                water += lmax - height[l];
            } else {
                r--;
                rmax = Math.max(rmax, height[r]);
                water += rmax - height[r];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution.trap(height)); // Output: 6
    }
}
