Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.

Notes:

Expected solution is linear in time and constant in space.
For example,

List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.




public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverse=rev(slow.next);
        ListNode curr=A;
        while(reverse!=null)
        {
            if(reverse.val!=curr.val)
            return 0;
            reverse=reverse.next;
            curr=curr.next;
        }
        return 1;
    }
    ListNode rev(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode resthead=rev(head.next);
        ListNode restTail=head.next;
        restTail.next=head;
        head.next=null;
        return resthead;
    }

}
