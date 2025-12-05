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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>();
        if(root==null)return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                root=q.remove();
                if(size==1)res.add(root.val);
                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);
                size--;
            }
        }
        return res;
    }
}