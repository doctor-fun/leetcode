/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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

//刚开始时一个不知道是不是null的节点作为根
//然后不是null的话考虑它的左右子的情况，如果左右子也存在，可以考虑它的孙子。
//把孙子当成一颗独立的树，讨论它的递归开始的条件
//递归重要的放入的对象是什么，放入的对象以后也把它想象成一颗树，对这颗树进行递归，获得索要的结果，
//判断递归的发生条件

class Solution {
    private int sum=0;
    public int rob(TreeNode root) {
        if(root==null) return 0;
        int val1=root.val;
        if(root.left!=null) val1+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null) val1+= rob(root.right.left)+rob(root.right.right);
       int val2=rob(root.left)+rob(root.right);
       return Math.max(val1, val2);

    }
 
}

