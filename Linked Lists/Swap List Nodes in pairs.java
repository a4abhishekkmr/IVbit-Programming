Given 1->2->3->4, you should return the list as 2->1->4->3.




public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode curr=A;
        if(A==null || A.next==null) return A;
        while( curr!=null && curr.next!=null)
        {
            int temp=curr.val;
            curr.val=curr.next.val;
            curr.next.val=temp;

            curr=curr.next.next;
        }
        return A;
