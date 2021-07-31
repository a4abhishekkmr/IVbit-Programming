Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<A.length;i++)
        {
            if(set.contains(A[i]-B) ||set.contains(B+A[i]))
            return 1;


            set.add(A[i]);

        }
        return 0;
    }
}
