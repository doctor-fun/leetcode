/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class ListNode {
   int val;
   ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}
//停下来的条件两个节点相等，
//循环终止条件,无论哪个跑到结尾都终止，因为l2多跑一步，所以每次让其跑，都要判断l2.next是否为null
class Solution{
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode l1=head,l2=head.next;
        while(l1!=null && l2!=null && l2.next!=null){
            if(l1==l2){
                return true;
            }
            l1=l1.next;//跑一步
            l2=l2.next.next;//跑两步
        }
        return false;
        
    }
}
class Main{

  public static void main(String[] args){
    Solution1 solution=new  Solution1();
    ListNode head=new ListNode(3);
    ListNode Node_1=new ListNode(2);
    head.next=Node_1;
    ListNode Node_2=new ListNode(0);
    Node_1.next=Node_2;
    ListNode Node_3=new ListNode(4);
    Node_2.next=Node_3;
    Node_3.next=Node_1;
    boolean flag= solution.hasCycle(head);
    System.out.println(flag);
  }
}


