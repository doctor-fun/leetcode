import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
 
// 1.快慢指针找到中点 
// 2.将链表分为左右两个链表,左边链表到中间节点为止设为null
// 3.将右边的链表逆序 
// 4.对比左右链表是否相等（右边链表长度可能比左边链表少1 因此右边链表为空时结束循环）
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode fast=head;
        ListNode slow =head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        if(fast!=null) slow = slow.next;
        cut(head,slow);
        return isEqual(head,reverse(slow));
        //此时slow节点就是后半段
        
    }

    //head这条链的尾部设定为中间节点前一个节点为止(null)
    private void cut(ListNode head,ListNode cutNode){
        while(head.next!=cutNode){
            head=head.next;
        }
        head.next=null;
    }
    //头插法
    //生成尾部节点，然后头部指向这个节点，
    private ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next=newHead;
            newHead=head;
            head=nextNode;
        }
        return newHead;
    }
    private boolean isEqual(ListNode l1,ListNode l2){
        while(l1!=null && l2!=null){
            if(l1.val!=l2.val) return false;
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }
}

