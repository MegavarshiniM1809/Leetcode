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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode>q1=new ArrayDeque<>();
        Queue<TreeNode>q2=new ArrayDeque<>();
        Boolean res=true;
        if(p==null && q==null)return true;
        if((p==null && q!=null)||(p!=null && q==null))return false;
        if(p!=null)q1.add(p);
        if(q!=null)q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            int size1=q1.size();
            int size2=q2.size();
            while(size1-->0 && size2-->0){
                p=q1.remove();
                q=q2.remove();
                if((p==null&&q!=null) || (p!=null&&q==null))return false;
                if(p!=null && q!=null){
                    if(p.val!=q.val)return false;
                }
                if((p.left==null && q.left!=null) ||(p.left!=null && q.left==null))return false;
                if(p.left!=null && q.left!=null){
                    if(p.left.val!=q.left.val)return false;
                }
                if((p.right==null && q.right!=null) ||(p.right!=null && q.right==null))return false;
                 if(p.right!=null && q.right!=null){
                    if(p.right.val!=q.right.val)return false;
                 }
                if(p.left!=null)q1.add(p.left);
                if(p.right!=null)q1.add(p.right);
                if(q.left!=null)q2.add(q.left);
                if(q.right!=null)q2.add(q.right);
            }
        }
        return res;
    }
}