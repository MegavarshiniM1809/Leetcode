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
    int count=0;
    void count(TreeNode curr){
        if(curr==null)return;
        count++;
        count(curr.left);
        count(curr.right);
    }
    public int countNodes(TreeNode root) {
        TreeNode curr=root;
        count(curr);
        return count;
    }
}