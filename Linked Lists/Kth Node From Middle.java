
Example Input
Input 1:

 A = 3 -> 4 -> 7 -> 5 -> 6 -> 1 6 -> 15 -> 61 -> 16
 B = 3
 Input 2:

 A = 1 -> 14 -> 6 -> 16 -> 4 -> 10
 B = 2
 Input 3:

 A = 1 -> 14 -> 6 -> 16 -> 4 -> 10
 B = 10


Example Output
Output 1:

 4
 Output 2:

 14
 Output 3:

 -1




 public class Solution {
    public int solve(ListNode A, int B) {
        ListNode slow=A;
        ListNode fast=A;
        int count=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            count++;
        }
        if(count<B)
        return -1;
        int diff=count-B;
        fast=A;
        for(int i=0;i<diff;i++)
        fast=fast.next;

        return fast.val;

    }
}
