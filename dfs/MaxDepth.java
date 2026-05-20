import javax.swing.tree.TreeNode;

/**
Given the root of a binary tree, return its depth.

The depth of a binary tree is defined as the number of nodes along the longest path from the root node 
down to the farthest leaf node.
 */
public class MaxDepth {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int maxDepthLeft = maxDepth(root.left);
            int maxDepthRight = maxDepth(root.right);

            return 1 + Math.max(maxDepthLeft, maxDepthRight);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Input: [3,9,20,null,null,15,7]
        // Tree:
        //        3
        //       / \
        //      9  20
        //         / \
        //        15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = sol.maxDepth(root);

        System.out.println("Max Depth = " + result);
    }
}