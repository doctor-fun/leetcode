/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
 */

 class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
 }
 //这道题不用树高一致
//重新生成树，
//想象成
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)return null;
        if(t1==null) return t2;
        if(t2==null) return t1;
        TreeNode root=new TreeNode(t1.val+t2.val);
       //指定左子
       //指定右子
        root.left=mergeTrees(t1.left, t2.left);
        root.right=mergeTrees(t1.right, t2.right);
        return root;
    }
}

