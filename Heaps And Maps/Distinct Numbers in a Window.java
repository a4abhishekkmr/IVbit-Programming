Problem Description

You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE:  if B > N, return an empty array.



public class Solution {
    public int[] dNums(int[] A, int B) {
        int n=A.length;

        int arr[]=new int[n-B+1];

        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<B;i++)
        {
            h.put(A[i],h.getOrDefault(A[i],0)+1);
        }
        arr[0]=h.size();

        for(int i=B;i<n;i++)
        {h.put(A[i-B],h.get(A[i-B])-1);

        if(h.get(A[i-B])==0)
        h.remove(A[i-B]);

        h.put(A[i],h.getOrDefault(A[i],0)+1);
        arr[i-B+1]=h.size();
        }

        return arr;
    }
}
