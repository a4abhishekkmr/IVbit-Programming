Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:

Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:

Given m, n satisfy the following condition:

1 ≤ m ≤ n ≤ length of list.





public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {



        ListNode curr=A;
        ListNode prev=null;
        ListNode temp=null;

        int length=0;

        ListNode start=null;
        ListNode startrev=null;
        ListNode end=null;
        ListNode endrev=null;

        while(length<B)
        {
            length++;
            if(length==B-1)
            start=curr;

            else if(length==B)
            startrev=curr;

            prev=curr;
            curr=curr.next;
        }

        while(length<C)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            length++;
            if(length==C)
            {
                endrev=prev;
                end=curr;
                startrev.next=end;
                if(start!=null)
                {
                    start.next=endrev;
                }
                else if(start==null)
                A=endrev;
            }
        }
        return A;
      }
    }
