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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        k=k%c;
        if(k==0) return head;
        while(k>0){
            ListNode prev=null;
            temp=head;
        while(temp.next!=null && k>0){
            prev=temp;
            temp=temp.next;
           
        }
        prev.next=null;
        temp.next=head;
        head=temp;

        k--;
        }
        return head;
        
    }
}