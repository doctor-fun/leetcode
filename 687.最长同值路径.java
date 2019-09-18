/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
 }

 //先想象成一个只有3个节点的树，再对他这棵树的3个节点进行统计
class Solution {
    private  int path =0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
    }
    private int dfs(TreeNode root){
            if (root==null) return 0;
            int left=dfs(root.left);//先对root.left的子树进行统计
            int right = dfs(root.right);
            int leftpath=root.left!=null &&root.left.val==root.val?left+1:0;
            int rightpath =root.right!=null && root.right.val==root.val?right+1:0;
            path = Math.max(path, leftpath + rightpath);
            return Math.max(leftpath,rightpath);
    }
}

