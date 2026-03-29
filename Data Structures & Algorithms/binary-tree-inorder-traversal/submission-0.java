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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp = root;
        List<Integer> inorderTraversed = new ArrayList<>();
        if (root == null) {
            return inorderTraversed;
        }
        traverseInOrder(root, inorderTraversed);
        return inorderTraversed;
    }

    private void traverseInOrder(TreeNode root, List<Integer> list) {
        if(root.left == null && root.right==null) {
            list.add(root.val);
            return;
        }
        if(root.left != null) {
            traverseInOrder(root.left, list);
        }
        list.add(root.val);
        if(root.right != null) {
            traverseInOrder(root.right, list);
        }
    }
}