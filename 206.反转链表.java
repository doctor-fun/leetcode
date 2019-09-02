/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// Definition for singly-linked list.
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
 //新建链表的意思就是从头开始建立，那么第一个节点肯定为-1;
 //让newhead.next=head就可以了，然后让head指针往后移动一个位置，直到head为null
 //https://blog.csdn.net/weixin_44438340/article/details/88875701
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=new ListNode(-1);
        while(head!=null){
            ListNode next = head.next;
            head.next=newHead.next;//head.next=null
            newHead.next=head;
            head=next;
        }
    }
}

