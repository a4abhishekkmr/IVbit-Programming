You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)

Output: 7 -> 0 -> 8

    342 + 465 = 807
Make sure there are no trailing zeros in the output list

So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.






public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode ans=null;

        if(A==null) return (B);
        if(B==null) return (A);
        int sum=(A.val+B.val)%10;
        int carry=(A.val+B.val)/10;
        ans=new ListNode( sum);
        ListNode t=ans;
        A=A.next;
        B=B.next;
        //carry
        while(A!=null || B!=null)
        {
            int s=(A!=null?A.val:0)+(B!=null?B.val:0)+carry;
            sum=(s)%10;
            ans.next=new ListNode( sum);
            carry=(s)/10;
            ans=ans.next;
            if(A!=null) A=A.next;
            if(B!=null) B=B.next;
        }
        if(carry>0)
        ans.next=new ListNode( carry);
        return t;

    }

}
