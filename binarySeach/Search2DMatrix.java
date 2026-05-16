/**
You are given an m x n 2-D integer array matrix and an integer target.

Each row in matrix is sorted in non-decreasing order.
The first integer of every row is greater than the last integer of the previous row.
Return true if target exists within matrix or false otherwise.

Can you write a solution that runs in O(log(m * n)) time?

Example 1:
Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
Output: true
 */
public class Search2DMatrix {
     public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int r = (ROWS * COLS) - 1;
        int l = 0;
        
        while(l <= r) {
            int m = (l + r) / 2;
            int row = m / COLS;
            int col = m % COLS;
            if(target == matrix[row][col]) {
                return true;
            } else if(target > matrix[row][col]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix s = new Search2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(s.searchMatrix(matrix, 3)); // true
        System.out.println(s.searchMatrix(matrix, 13)); // false
    }
}
