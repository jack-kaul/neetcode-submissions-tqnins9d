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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversePreOrder(root, result);
        return result;
    }

    private void traversePreOrder(TreeNode root, List<Integer> result) {
        if(root == null) return;
        result.add(root.val);
        if(root.left != null) {
            traversePreOrder(root.left, result);
        }

        if(root.right != null) {
            traversePreOrder(root.right, result);
        }

        return;
    }
}