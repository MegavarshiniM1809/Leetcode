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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        n=count-n;
        ListNode prev=null;
        curr=head;
        while(n>0){
            prev=curr;
            curr=curr.next;
            n--;
        }
        if(prev!=null)prev.next=curr.next;
        else head=curr.next;
        return head;
    }
}