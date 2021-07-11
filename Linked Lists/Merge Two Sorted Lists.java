Merge two sorted linked lists and return it as a new list.

The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

For example, given following linked lists :

  5 -> 8 -> 20
  4 -> 11 -> 15
The merged list should be :

4 -> 5 -> 8 -> 11 -> 15 -> 20





/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null) return B;
        if(B==null) return A;
        ListNode head= null;
        if(A.val<=B.val)
        {
            head=A;
            A=A.next;
        }
        else{
            head=B;
            B=B.next;
        }
        ListNode ans=head;
        while(A!=null && B!=null)
        {//ListNode temp=null;
            if(A.val<=B.val)
            {
                ans.next=new ListNode(A.val);
                A=A.next;
            }
            else
            {
                ans.next=new ListNode(B.val);
                B=B.next;
            }
            ans=ans.next;//it
            // ans.next=temp;
           // ans=temp;
        }
        if(A!=null)
        {
            ans.next=A;
        }
        if(B!=null)
        {
            ans.next=B;
        }
        return head;
    }
}
