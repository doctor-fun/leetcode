/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// Definition for a binary tree node.
 class TreeNode {
     int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
 }
//递归就是循环，从最底下开始循环，遇到左子判断一下，右子判断一下，
//找到每个节点的深度，需要记录左右两个子树的高度，做两个就可以了，从下往上增加
class Solution {
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return max;
    }
    private int depth(TreeNode root){
        if(root ==null) return 0;
        int leftDepth=depth(root.left);
        int rightDepth= depth(root.right);
        max = Math.max(max,leftDepth+rightDepth);
        return Math.max(leftDepth, rightDepth)+1;
    }
}

