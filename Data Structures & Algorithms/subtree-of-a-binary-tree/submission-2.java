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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root != null){

        boolean res =  isSubtree(root.left, subRoot);
        res = res ||  isSubtree(root.right, subRoot);
            if(root.val == subRoot.val){
                return  res || areSameTrees(root,subRoot);
            }
            else {
                return res;
            }

        }
         return  false;
    }

    private boolean areSameTrees(TreeNode root, TreeNode subRoot){
        if(root== null){
            if(subRoot != null){
                return false;
            } else {
                return true;
            }
        } else {
            if(subRoot == null || root.val != subRoot.val){
                return false;
            } else {
                 return areSameTrees( root.left, subRoot.left) && areSameTrees(root.right, subRoot.right);
            }
        }
    }
}