/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
//pathSumStartWithRoot相当于Dfs，深度优先，可以遍历到最底层，不用管sum是不是>或者小于，因为要的只是flag结果，修改flag(ret)
//对每个节点都要试一遍pathSum
class Solution {

    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        int ret = pathSumStartWithRoot(root, sum)+pathSum(root.left,sum)+ pathSum(root.right,sum);
        return ret;        
    }
    //作用是对root节点统计左右子树的符合条件的路径之和
    private int pathSumStartWithRoot(TreeNode root,int sum){
        if(root==null) return 0;
        int ret =0;
        if(root.val==sum) ret ++;
        ret += pathSumStartWithRoot(root.left, sum-root.val)+pathSumStartWithRoot(root.right, sum-root.val);
        return ret;
    }
    
}

