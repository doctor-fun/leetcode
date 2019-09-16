/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
//只考虑上下关系，不要考虑整棵树（找边界条件的时候可以考虑）
//首先查看返回值是什么，是boolean，而不是node
//处理边界条件
//处理变量
//处理左子右子

class Solution {
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null ) return false;
        //注意必须是叶子节点
        if(root.left == null && root.right == null && root.val == sum) return true;
        sum=sum-root.val;
     return    hasPathSum(root.left, sum)  ||        hasPathSum(root.right,sum);
 


        
    }
}

