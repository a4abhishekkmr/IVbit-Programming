Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,

return 4->5->1->2->3->NULL.






public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        // if(B==0) return A;
        ListNode curr = A;

        int len = 1;
        while(curr.next != null){
            len = len + 1;                         // length of the linked list
           curr=curr.next;//curr last
        }
        ListNode curr1=A;//reset
        if(B>len)
        B=B%len;

        if(B==0 ||len==1)
        return A;

        int count = 1;
        while(count<len-B && curr1!=null)
        {
            curr1=curr1.next;
            count++;
        }
        ListNode first=curr1.next;
        curr1.next=null;
        curr.next=A;

        return first;
    }
}
