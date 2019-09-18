/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
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
//这道题没有说明，所有value是不一样的
//主结构遍历每一个节点(抽象，root,root.left,root.right)，子结构做深搜
//先假设各种树型，如主节点都为null等
//先判断主节点是不是一样，
//递归是循环，要注意循环的变量变化（一般指针指向不一样)
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) return false;
        //判断主节点是不是一致，isSubtreeWithRoot(s, t)
        //再判断子节点有没有一致的
        return isSubtreeWithRoot(s, t) || isSubtree(s.left, t)||isSubtree(s.right, t);
        
    }
    private boolean isSubtreeWithRoot(TreeNode s,TreeNode t){
        if(t==null && s ==null) return true;
        //到这的话说明至少有一个不等于Null
        if(t==null||s==null) return false; //不能其中一个为null，只有一个为null，就说明不完全一致了
        if(t.val !=s.val) return false;
        //到这说明root是一致的，接着判断子节点，子节点的话再换指针方向，循环下就好了
        return isSubtreeWithRoot(s.left, t.left) && isSubtreeWithRoot(s.right, t.right);
    }

    
}

