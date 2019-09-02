/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

//链表的题目一个节点即可代表一个链
//每次比较得到两个节点中较小的节点作为结果返回，并继续对剩下来的链表重新获得较小节点。
//将较小节点的下一个节点和另外一条链作为输入
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if (l2==null) return l1;
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1, l2.next);
            return l2;
        }

        
    }
}

