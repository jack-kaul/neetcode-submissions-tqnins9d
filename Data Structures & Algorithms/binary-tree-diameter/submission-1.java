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
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
       findDepth(root);
       return diameter;
    }

    public int findDepth(TreeNode root) {
        if(root == null || root.right == null && root.left == null) {
            return 0;
        }

        int left = 0, right = 0;
        if(root.left != null) {
            left = 1 + findDepth(root.left);
        }
        
        if(root.right != null) {
            right = 1 + findDepth(root.right);
        }

        diameter = Math.max(diameter, left + right);
        return Math.max(left, right);
    }
}
