/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
///
//重新建链表的过程
//链表每个节点就相当于一个子链表
//处理一个链表接着处理它的子节点
//递归遍历所有的子分支，选择返回的节点，如果此节点和下一个节点不等，则返回此节点，不然返回下一个节点


// class Solution {
//         public ListNode deleteDuplicates(ListNode head) {
//             if (head == null || head.next == null) return head;
//             head.next = deleteDuplicates(head.next);
//             return head.val == head.next.val ? head.next : head;
//         }
//  }

 class Solution{
      public ListNode deleteDuplicates(ListNode head){
          if(head==null|| head.next==null) return head;//如果到达节点尾部，则返回当前节点
             head.next=deleteDuplicates(head.next);
          return head.val==head.next.val?head.next:head;
      }
 }

