/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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

//刚开始假设只是一颗三节点的树、
//思考的过程就是长树的过程
//思考的两不大，始终只判断对称位置的位置就可以了
//先判断root是不是null，再判断左子右子是不是一致，再判断左左孙和右右孙是不是一致，同时判断左右孙和右左孙是不是一致
class Solution {
    public boolean isSymmetric(TreeNode root) {
        //这里是初始阶段，刚领到一棵树
        if(root ==null ) return true;//假如是颗空树，那么返回就好了
        return isSymmetric(root.left,root.right);

        
    }
    private boolean isSymmetric(TreeNode t1,TreeNode t2){
        //判断这颗小子树的情况
        if(t1==null && t2 ==null) return true;
        if(t1==null || t2==null) return false;
        if(t1.val!=t2.val) return false;
        //到这就相等了，直接返回
        //循环到下一个阶段,这里开始考虑两颗子树的情况，
        return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right,t2.left);//循环的时候是关键
    
    }
}

