Given a singly linked list

    L: L0 → L1 → … → Ln-1 → Ln,
reorder it to:

    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
You must do this in-place without altering the nodes’ values.

For example,

Given {1,2,3,4}, reorder it to {1,4,2,3}.




/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        if(A==null || A.next==null || A.next.next==null) return A;
       ArrayDeque<ListNode> st=new ArrayDeque<ListNode>();

       ListNode it=A;

       ListNode slow=A;
       ListNode fast=A;
       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
       ListNode break1=slow;
       while(slow.next!=null)
       {
           slow=slow.next;
           st.push(slow);

       }
        break1.next=null;
       while(it.next!=null && st.isEmpty()==false)
       {
           ListNode next1=it.next;
           it.next=st.pop();
           it.next.next=next1;
           it=it.next.next;
       }
       return A;

    }
}
