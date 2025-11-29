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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode curr=head,start=head,prev=null;
        ListNode temp=null,rev;
        int count=1,i;
        while(curr!=null){
            for(i=1;i<count&&curr!=null;i++,curr=curr.next);
            if(curr==null)i=i-1;
            if(i%2==0){
                if(curr!=null){
                    temp=curr.next;
                    curr.next=null;
                }
                else
                    temp=null;
                    rev=reverseList(start);
                    if(prev!=null)prev.next=rev;
                    else head=rev;
                    prev=start;
                    start=curr=temp;
            }
                else{
                    if(prev!=null)prev.next=start;
                    prev=curr;
                    if(curr!=null)
                    start=curr=curr.next;
                }
                count++;
            
        }
        return head;
        }
        ListNode reverseList(ListNode head){
            ListNode curr=head,prev=null;
            while(curr!=null){
                ListNode front=curr.next;
                curr.next=prev;
                prev=curr;
                curr=front;
            }
            return prev;
        }
}