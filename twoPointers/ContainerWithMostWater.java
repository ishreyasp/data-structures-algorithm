/**
You are given an integer array heights where heights[i] represents the height of the ith bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Example 1:
Input: height = [1,7,2,5,4,7,3,6]
Output: 36
 */
class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;

        while(l < r) {
            int area = Math.min(heights[r], heights[l]) * (r - l);
            
            res = Math.max(res, area);

            if(heights[r] >= heights[l]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(c.maxArea(heights));
    }
}
