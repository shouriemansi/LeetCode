/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode before=slow;
        ListNode newnode=null;
        ListNode previous=null;
        ListNode current=slow.next;
        while(current!=null){
            newnode=current.next;
            current.next=previous;
            previous=current;
            current=newnode;
        }
        before.next=previous;
        ListNode t1=head;
        int max=Integer.MIN_VALUE;
        int sum=0;
        ListNode t2=previous;
        while(t2!=null){
            sum= t1.val+t2.val;
            if(sum>max){
                max=sum;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return max;
    }
}