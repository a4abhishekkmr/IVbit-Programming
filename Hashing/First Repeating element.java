Problem Description

Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of first occurrence is smallest.

If there is no repeating element, return -1.



Example Input
Input 1:

 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:

 A = [6, 10, 5, 4, 9, 120]


Example Output
Output 1:

 5
Output 2:

 -1


Example Explanation
Explanation 1:

 5 is the first element that repeats
Explanation 2:

 There is no repeating element, output -1




 public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
              if(hm.containsKey(A[i]))
                hm.put(A[i], hm.get(A[i])+1);
            else
                hm.put(A[i], 1);
        }
        for(int i=0;i<A.length;i++)
        {
            if(hm.get(A[i])>1)
            return A[i];
        }
        return -1;
    }
}
