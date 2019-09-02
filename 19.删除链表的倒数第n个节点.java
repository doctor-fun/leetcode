/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//  class ListNode {
//         int val;
//          ListNode next;
//          ListNode(int x) { val = x; }
//      }

   //快慢指针,快指针先指在正向第n个节点，然后让慢指针和快指针一起往前跑，当快指针到Null了，那么慢指针自然指向倒数第N个节点了
   //将慢指针slow.next=slow.next.next;，队列里就没有第n个节点了，只要对队里里有操作的，就是对公共数据进行操作
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast=head;
            while(n-- > 0){
                fast=fast.next;//此时fast指向正数第二个指针
            }
            if (fast==null) return head.next;
            ListNode slow =head;
            while (fast.next!=null){
                fast=fast.next;//向后移一位
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        
        
    }
}

