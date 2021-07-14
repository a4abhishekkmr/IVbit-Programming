Example Input
Input 1:

A = 1 -> 2 -> 3 -> 4
Input 2:

A = 1 -> 2 -> 3


Example Output
Output 1:

 1 -> 4 -> 3 -> 2
Output 2:

 1 -> 2 -> 3






 public class Solution {
    public ListNode solve(ListNode A) {
       ArrayDeque<Integer> st=new ArrayDeque<Integer>();

       ListNode it=A;
       int i=1;
       while(it!=null)
       {
           if(i%2==0)
           st.push(it.val);
            i++;//even on st;
            it=it.next;
       }
       it=A;
       i=1;
       while(it!=null && !(st.isEmpty()))
       {
           if(i%2==0)
           it.val=st.pop();

           it=it.next;
           i++;
       }

        return A;
    }
}
