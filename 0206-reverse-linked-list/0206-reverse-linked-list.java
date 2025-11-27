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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,prev=null;
        ListNode reshead = null , restail = null;
        while(head!=null){
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            if(prev!=null)prev.next=null;
            else head=null;
            if(reshead == null){
                reshead = curr;
                restail = curr;
            }
            else{
                restail.next = curr;
                restail = restail.next;
            }
            curr=head;
            prev=null;
        }
        return reshead;
    }
}