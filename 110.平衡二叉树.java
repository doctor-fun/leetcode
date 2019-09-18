/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  //平衡树的问题仍然是树高的问题，因为任何一个分支都可能树高不对，所以需要设置一个flag，同时计算左右节点的
class Solution {
    private boolean result=true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
        
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int l =maxDepth(root.left);
        int r = maxDepth(root.right);
        if(Math.abs(l-r)>1) result=false;
        return 1+Math.max(l,r);
    }

}

