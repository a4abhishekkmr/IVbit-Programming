Given a singly linked list and an integer K, reverses the nodes of the

list K at a time and returns modified linked list.

NOTE : The length of the list is divisible by K

Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6 and K=2,

You should return 2 -> 1 -> 4 -> 3 -> 6 -> 5

Try to solve the problem using constant extra space.





public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode curr=A,next=null,prev=null;
        int count=0;
        while(curr!=null && count<B)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }//Reverse
        if(next!=null)//left
        {
            ListNode resthead=reverseList(next,B);
            A.next=resthead;
        }
        return prev;
    }
}
