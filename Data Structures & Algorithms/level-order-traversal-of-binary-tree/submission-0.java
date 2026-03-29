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
    final Integer dummyVal = 9999;

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        TreeNode dummy = new TreeNode(dummyVal);
        q.offer(root);
        q.offer(dummy);

        while(q.size() > 1) {
            List<Integer> currLevel = new ArrayList<>();
            while(q.peek().val != dummyVal) {
                TreeNode currNode = q.remove();
                currLevel.add(currNode.val);

                //adding the children
                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            q.remove();
            q.add(dummy);

            //add the level to result
            res.add(currLevel);
        }

        return res;
    }
}
