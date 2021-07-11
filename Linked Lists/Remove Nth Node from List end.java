Given linked list: 1->2->3->4->5, and n = 2.

  After removing the second node from the end, the linked list becomes 1->2->3->5.





  public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode curr=A;
        ListNode t=A;
        ListNode start=A;
        for(int i=0;i<B;i++)
        {
            if(curr.next==null)
            return A.next;

            curr=curr.next;
        }
        while(curr.next!=null)
        {
            start=start.next;
            curr=curr.next;
        }
        start.next=start.next.next;
        return t;
    }
}
