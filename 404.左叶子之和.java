/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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

 //递归的本质可以当成普通函数来处理，要求获得返回值的时候不要去考虑细节
class Solution {
    private int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if (isLeaf(root.left)) return root.left.val + sumOfLeftLeaves(root.right);
        //到这左子就不是叶子节点
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        
    }


    private boolean isLeaf(TreeNode node){
        if (node == null) return false;
        return node.left == null && node.right == null;
    }
}

