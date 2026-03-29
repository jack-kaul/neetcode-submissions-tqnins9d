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
    public int diameterOfBinaryTree(TreeNode root) {
       Map<TreeNode, Integer> rootVsMax = new HashMap<>();
       findDepth(root, rootVsMax);
       int max = 0;
       for(Map.Entry<TreeNode, Integer> entry : rootVsMax.entrySet()) {
        if(entry.getValue() > max) {
            max = entry.getValue();
        }
       }
       return max;
    }

    public int findDepth(TreeNode root, Map<TreeNode, Integer> rootVsMax) {
        if(root == null || root.right == null && root.left == null) {
            return 0;
        }

        int left = 0, right = 0;
        if(root.left != null) {
            left = 1 + findDepth(root.left, rootVsMax);
        }
        
        if(root.right != null) {
            right = 1 + findDepth(root.right, rootVsMax);
        }

        rootVsMax.put(root, left + right);
        return Math.max(left, right);
    }
}
