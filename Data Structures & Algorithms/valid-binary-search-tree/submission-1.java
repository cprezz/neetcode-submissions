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
  List<Integer> list;
    public boolean isValidBST(TreeNode root) {
      list = new ArrayList<>();
      inorder(root);
      int prev = -1000000001;
      for(int num : list){
        if(num <= prev)
        return false;
        prev = num;
      } 
       return  true;
    }

     void inorder(TreeNode root){
      if(root == null)
      return ;
      inorder(root.left);
      list.add(root.val);
      inorder(root.right);
     }
}
