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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        return getRevertedTree(root);
    }

    private TreeNode getRevertedTree(TreeNode root) {
        TreeNode newRoot = new TreeNode(root.val);
        if(root.left != null) {
            TreeNode newRight = getRevertedTree(root.left);
            newRoot.right = newRight;
        }

        if(root.right != null) {
            TreeNode newLeft = getRevertedTree(root.right);
            newRoot.left = newLeft;
        }

        return newRoot;
    }
}
