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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode temp=head;
        ListNode before=null;
        for(int i=1;i<left;i++){
            before=temp;
            temp=temp.next;
        }
        ListNode current=temp;
        ListNode previous=null;
        ListNode newnode=null;
        for(int i=0;i<=right-left;i++){
            newnode=current.next;
            current.next=previous;
            previous=current;
            current=newnode;
        }
        if(before!=null){
            before.next=previous;
        }
        else{
            head=previous;
        }
        temp.next=current;
        return head;
    }
}