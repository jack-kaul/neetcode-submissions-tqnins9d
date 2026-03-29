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
    private TreeNode ancestor = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findLowest(root, p, q);
        return ancestor;
    }

    public void findLowest(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return;

        if (root.val > p.val && root.val > q.val) {
            findLowest(root.left, p, q);
        } 
        else if (root.val < p.val && root.val < q.val) {
            findLowest(root.right, p, q);
        } 
        else {
            ancestor = root;
        }
    }
}