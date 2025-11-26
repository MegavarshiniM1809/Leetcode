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
        ListNode first=head;
        ListNode second=head;
        while(n-->1){
            second=second.next;
        }
        ListNode prev=null;
        while(second.next!=null&&second!=null){
            prev=first;
            first=first.next;
            second=second.next;
        }
        if(prev!=null)prev.next=first.next;
        else head=first.next;;
        return head;
    }
}