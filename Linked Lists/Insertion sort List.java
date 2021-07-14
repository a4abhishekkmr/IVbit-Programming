Sort a linked list using insertion sort.

We have explained Insertion Sort at Slide 7 of Arrays

Insertion Sort Wiki has some details on Insertion Sort as well.

Example :

Input : 1 -> 3 -> 2

Return 1 -> 2 -> 3




public class Solution {
    public ListNode insertionSortList(ListNode A) {

        ListNode curr=A.next;

        while(curr!=null)
        {
            //int key=curr.val;
            ListNode temp=A;
            while(temp!=curr)
            {
                if(temp.val<curr.val)
                temp=temp.next;

                else
                {
                    int l=temp.val;
                    temp.val=curr.val;
                    curr.val=l;
                }
            }
            curr=curr.next;
        }
        return A;
    }
}
