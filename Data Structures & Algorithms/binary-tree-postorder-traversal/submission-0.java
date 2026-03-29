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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversePostOrder(root, res);
        return res;
    }

    public void traversePostOrder(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }
        if(root.left != null) {
            traversePostOrder(root.left, result);
        }
        if(root.right != null) {
            traversePostOrder(root.right, result);
        }
        result.add(root.val);
    }
}