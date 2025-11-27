class Solution {
    ListNode reverse(ListNode start){
        ListNode curr=start;
        ListNode prev=null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        int count=1;
        ListNode prev=null,curr=head,start=null;
        while(curr!=null&&count<right){
            if(count<left)prev=curr;
            if(count==left)start=curr;
            curr=curr.next;
            count++;
        }
        ListNode temp=curr.next;
        curr.next=null;
        ListNode rev=reverse(start);
        start.next=temp;
        if(head==start)return rev;
        prev.next=rev;
        return head;

    }
}
