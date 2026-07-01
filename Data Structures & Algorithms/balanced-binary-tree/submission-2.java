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
    Boolean res = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return res;
        
    }

    private int height(TreeNode root){
        if(root == null || !res)
        return 0;

    
        int left = height(root.left);
        int right = height(root.right);

        res =res && Math.abs(left - right) <=1;
        

        return Math.max(left, right) +1;
    }
}
