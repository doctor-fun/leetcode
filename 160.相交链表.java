/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
         val = x;
          next = null;
      }
}
//设交点及以后部分为c，交点前A的部分为a,B的部分为b
//可知:a+c+b=b+c+a
//所以a+c为链A遍历完它开始遍历b，b+c为链B,遍历完它开始遍历a，最终会因为节点个数的原因汇聚到交叉点，两个节点相等（首地址）即为结果节点(null或者交叉节点)
 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode l1 = headA, l2 = headB;
            while (l1 != l2) {
                l1 = (l1 == null) ? headB : l1.next;
                l2 = (l2 == null) ? headA : l2.next;
            }
            return l1;
    }
}
// class Main{
//     public static void main(String[] args){
//         Solution1 solution1=new Solution1();
//         ListNode head_a=new ListNode(0);
//         ListNode Head_b=new ListNode(3);
//         ListNode Node2=new ListNode(2);
//         Head_b.next = Node2;
//         ListNode Node9=new ListNode(9);
//         head_a.next=Node9;
//         ListNode Node1=new ListNode(1);
//         Node9.next=Node1;
//         Node1.next=Node2;
//         ListNode Node4=new ListNode(4);
//         Node2.next=Node4;
//         ListNode result =solution1.getIntersectionNode(head_a,Head_b);
//         System.out.println(result);
        
//     }
}


