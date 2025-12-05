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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>();
        if(root==null)return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>temp=new ArrayList<>();
            while(size-->0){
                root=q.remove();
                temp.add(root.val);
                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);
            }
            res.add(temp);
        }
        return res;
    }
}