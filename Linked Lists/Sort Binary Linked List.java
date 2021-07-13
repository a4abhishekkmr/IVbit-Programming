Example Input
Input 1:

 1 -> 0 -> 0 -> 1
Input 2:

 0 -> 0 -> 1 -> 1 -> 0


Example Output
Output 1:

 0 -> 0 -> 1 -> 1
Output 2:

 0 -> 0 -> 0 -> 1 -> 1


Example Explanation
Explanation 1:

 The sorted linked list looks like:
  0 -> 0 -> 1 -> 1
Explanation 2:

 The sorted linked list looks like:
  0 -> 0 -> 0 -> 1 -> 1






  public class Solution {
    public ListNode solve(ListNode A) {
        if(A == null || A.next == null){
            return A;
        }
        ListNode pointer = A;
        int count = 0;
        int len = 0;
        while(pointer != null){
            len = len + 1;                         // length of the linked list
            if(pointer.val == 1){
                count += 1;                       // number of nodes with value = 1
            }
            pointer = pointer.next;
        }
        ListNode temp = A;
        int ctr = 0;
        while(temp != null){
            ctr += 1;
            if(ctr <= len - count){                       // until ctr < length of LL - number of nodes wiht value = 1
                temp.val = 0;
            }
            else{
                temp.val = 1;
            }
            temp = temp.next;
        }
        return A;
    }
}
