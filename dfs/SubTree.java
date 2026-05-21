import javax.swing.tree.TreeNode;

/**
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root 
with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. 
The tree tree could also be considered as a subtree of itself.
 */
class SubTree {
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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }

        if(sameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
        isSubtree(root.right, subRoot);
    }

    private boolean sameTree(TreeNode m, TreeNode s) {
        if(m == null && s == null) {
            return true;
        }

        if(m == null || s == null) {
            return false;
        }

        return (m.val == s.val) &&
        (sameTree(m.left, s.left)) &&
        (sameTree(m.right, s.right));
    }
}
