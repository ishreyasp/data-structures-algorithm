import java.util.Stack;

/**
You are given an array of integers heights where heights[i] represents the height of a bar. The width of each bar is 1.

Return the area of the largest rectangle that can be formed among the bars.

Note: This chart is known as a histogram.

Example 1:
Input: heights = [7,1,7,2,2,4]
Output: 8

Example 2:
Input: heights = [1,3,7]
Output: 7
 */
class LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack();

        for(int i = 0; i <= heights.length; i++) {
            int curHeight = (i == heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && curHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];

                int width;
                if(stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    } 
    
    public static void main(String[] args) {
        LargestRectangleHistogram lrh = new LargestRectangleHistogram();
        int[] heights = {2,1,5,6,2,3};
        System.out.println(lrh.largestRectangleArea(heights));
    }
}
