Example Input
Input 1:

 A = 3 -> 4 -> 7 -> 5 -> 6 -> 6 -> 15 -> 61 -> 16
 B = 3
 Input 2:

 A = 1 -> 4 -> 6 -> 6 -> 4 -> 10
 B = 2


Example Output
Output 1:

 7 -> 4 -> 3 -> 5 -> 6 -> 6 -> 16 -> 61 -> 15
Output 2:

 4 -> 1 -> 6 -> 6 -> 10 -> 4






public class Solution {
    public ListNode solve(ListNode A, int B) {
        ListNode curr=A;
        ListNode next=null,prev=null;
        int count=0;
        while(curr!=null && count<B)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(A!=null)
        {
            A.next=curr;
        }
        count=0;
        while(count<B-1 && curr!=null)
        {
            curr=curr.next;
            count++;
        }
        if(curr!=null)
        {
            curr.next=solve(curr.next,B);
        }

        //new head;
        return prev;
    }
}
