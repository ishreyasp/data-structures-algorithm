import javax.swing.tree.TreeNode;

/**
The diameter of a binary tree is defined as the length of the longest path between any two nodes within the tree. 
The path does not necessarily have to pass through the root.

The length of a path between two nodes in a binary tree is the number of edges between the nodes. 
Note that the path can not include the same node twice.

Given the root of a binary tree root, return the diameter of the tree.
 */
class DiameterofBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}
