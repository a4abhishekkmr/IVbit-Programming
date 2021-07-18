Given an array of non negative integers A, and a range (B, C),

find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]

where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3

as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8].




public class Solution {
    public int numRange(int[] A, int B, int C) {
        int count=0;
        int n=A.length;
        int sum=0;
        int j=0;
        int i=0;
        while(i<n)
        {
            sum+=A[j];
            if(sum>=B && sum<=C)
            {
                count++;
                j++;
            }
            else if(sum>C)
            {
                i++;
                j=i;
                sum=0;
            }
            else if(sum<B)
            {
                j++;
            }
            if(j==n)
            {
                i++;
                j=i;
                sum=0;
            }

        }
        return count;
    }
}
