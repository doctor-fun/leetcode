/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

 // Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    //要先思考返回的是什么，如果用递归做，那么要先思考最上层栈返回的是什么类型，再考虑各种情况就可以了
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        //向上递归的时候
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        
    }
}

