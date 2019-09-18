/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
//刚开始是一个节点
//判断它应该返回的值的时候把它想成root,用完马上丢
//有可能是个单枝的树，要单独拿出来
class Solution {
    private int min=9999;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        //只要到这，就不可能是null
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //有1个位0，就说明是颗单枝的树
        if (left == 0 || right == 0) return left + right + 1;//这么写就不用判断哪个是0，减少代码量
        return Math.min(left,right)+1;

        
    }
}

