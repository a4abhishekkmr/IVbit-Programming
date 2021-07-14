Sort a linked list in O(n log n) time using constant space complexity.

Example :

Input : 1 -> 5 -> 4 -> 3

Returned list : 1 -> 3 -> 4 -> 5






public class Solution {
    public ListNode sortList(ListNode A) {
        if(A.next==null|| A.next==null) return A;

        ListNode mid=findMid(A);
        ListNode nextofmid=mid.next;
        mid.next=null;
        ListNode left=sortList(A);
        ListNode right=sortList(nextofmid);
        ListNode finalHead=sortedmerge(left,right);

        return finalHead;
    }
    ListNode sortedmerge(ListNode head1,ListNode head2)
    {
        ListNode merged=null;
        if(head1==null) return head2;
        if(head2==null) return head1;

        if(head1.val<=head2.val)
        {merged=head1;
        merged.next=sortedmerge(head1.next,head2);
        }
        else
        {
            merged=head2;
            merged.next=sortedmerge(head1,head2.next);
        }
        return merged;
    }
    ListNode findMid(ListNode head)
    {
        if(head==null) return head;
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
