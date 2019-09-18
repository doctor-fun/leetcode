/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
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

 //最重要的是发生递归的时机,考虑使用递归以后拿到的返回值是什么，对进入的递归的参数值要当成一棵树来考虑
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        //给定一个根，先判断它的结构
        
            if (root == null) return -1;
            if (root.left == null && root.right == null) return -1;
            int leftVal = root.left.val;
            int rightVal = root.right.val;
            if (leftVal == root.val) leftVal = findSecondMinimumValue(root.left);
            if (rightVal == root.val) rightVal = findSecondMinimumValue(root.right);
            if (leftVal != -1 && rightVal != -1) return Math.min(leftVal, rightVal);
            if (leftVal != -1) return leftVal;
            return rightVal;
        }
        
  
}

