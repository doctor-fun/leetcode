/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 */
//Definition for a binary tree node.
 class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
 }
//交换各自的指向就可以了
//递归要查看返回值是什么类型，这里返回的是个节点，只要将做有节点的指向换一下就好了
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(left);
        return root;
        
        
    }
}

