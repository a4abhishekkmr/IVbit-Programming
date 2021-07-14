Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,

Given 1->4->3->2->5->2 and x = 3,

return 1->2->2->4->3->5.






public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode curr=A;
        ListNode s=null;
        ListNode l1=s;
        ListNode b=null;
        ListNode l2=b;
        while(curr!=null)
        {
            if(curr.val<B)
            {
                if(s==null)
                {
                    s=new ListNode(curr.val);
                    l1=s;
                }
                else
                {
                    l1.next=new ListNode(curr.val);
                    l1=l1.next;
                }
            }
            else
            {
                if(b==null)
                {
                    b=new ListNode(curr.val);
                    l2=b;
                }
                else
                {
                    l2.next=new ListNode(curr.val);
                    l2=l2.next;
                }
            }
            curr=curr.next;
        }
        if(s==null) return b;
        l1.next=b;
        return s;
    }
}
